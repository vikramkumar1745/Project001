package com.finalbuilt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.evaluation.NominalPrediction;
import weka.classifiers.rules.DecisionTable;
import weka.classifiers.rules.OneR;
import weka.classifiers.rules.PART;
import weka.classifiers.trees.DecisionStump;
import weka.classifiers.trees.J48;
import weka.core.FastVector;
import weka.core.Instances;

public class Algorithm { 
	
	public static double max;
	public static BufferedReader readDataFile(String filename) {
		BufferedReader inputReader = null;
    
		try {
			inputReader = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException ex) {
			System.err.println("File not found: " );
		}
    
    return inputReader;
	}//end of reading

	public static Evaluation simpleClassify(Classifier model, Instances trainingSet, Instances testingSet) throws Exception {
		
		Evaluation validation = new Evaluation(trainingSet);
		model.buildClassifier(trainingSet);
		validation.evaluateModel(model, testingSet);
    
		return validation;
	}//end of Classify

	public static double calculateAccuracy(FastVector predictions) {
		
		double correct = 0;
		for (int i = 0; i < predictions.size(); i++) {
			NominalPrediction np = (NominalPrediction) predictions.elementAt(i);
        	if (np.predicted() == np.actual()) {
        		correct++;
        	}
		}
    
		return 100 * correct / predictions.size();
	}//end of calculateAccuracy

	public static Instances[][] crossValidationSplit(Instances dataSet,Instances data, int numberOfFolds) {
		
		Instances[][] split = new Instances[2][numberOfFolds];
		
			for (int i = 0; i < numberOfFolds; i++) {
				split[0][i] = dataSet.trainCV(numberOfFolds, i);
				split[1][i] = data.testCV(numberOfFolds, i);
			}
    
		return split;
	}

	public static void applyAlgorithm() {
		
		Instances data = null;
		Instances dataSet = null;
		try {
			BufferedReader datafile = readDataFile("D:\\Eclipse\\FinalBuilt\\src\\com\\finalbuilt\\Data.arff");
			data = new Instances(datafile);
			data.setClassIndex(data.numAttributes() - 1);
			datafile.close();
   
			BufferedReader datafile1 = readDataFile("D:\\Eclipse\\FinalBuilt\\src\\com\\finalbuilt\\DataSet.arff");
			dataSet = new Instances(datafile1);
			dataSet.setClassIndex(dataSet.numAttributes() - 1);
			datafile1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Instances[][] split = null;
		if(ArffFormat.count>9) {
		split = crossValidationSplit(data, dataSet, 10);
		} else if(ArffFormat.count>=4 && ArffFormat.count<=9) {
			split = crossValidationSplit(data, dataSet, 4);
		} else if (ArffFormat.count>2 && ArffFormat.count<4){
			split = crossValidationSplit(data, dataSet, ArffFormat.count);
		}
    
		Instances[] trainingSplits = split[0];
		Instances[] testingSplits  = split[1];
    
		Classifier[] models = {     new J48(),
                                	new PART(),
                                	new DecisionTable(),
                                	new OneR(),
                                	new DecisionStump() 
                               };
		max = 0;
		for(int j = 0; j < models.length; j++) {
				FastVector predictions = new FastVector();
				for(int i = 0; i < trainingSplits.length; i++) {
					Evaluation validation = null;
					try {
						validation = simpleClassify(models[j], trainingSplits[i], testingSplits[i]);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					predictions.appendElements(validation.predictions());
				}
				double accuracy = calculateAccuracy(predictions);
				if(max<accuracy) {
					max = accuracy;
				}
				
				System.out.println(models[j].getClass().getSimpleName() + ": " + String.format("%.2f%%", accuracy) + "\n=====================");
		}
		if(max<50) {
			GuiNormalMail.call();
		} else if(max>=50 && max<65) {
			GuiSuspiciousMail.call();
		} else {
			GuiPhishingMail.call();
		}
	}//end of main

}//end of class

