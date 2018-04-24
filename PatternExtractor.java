package com.finalbuilt;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExtractor {
	
	public static List<String> extractDomainOfSender(String input) {
        List<String> result = new ArrayList<String>();

        Pattern pattern = Pattern.compile( 
        		"mailto:(.+?)[\"?]");

        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            result.add(matcher.group());
        }

        return result;
    }
	
	public static List<String> extractUrls(String input) {
        List<String> result = new ArrayList<String>();

        Pattern pattern = Pattern.compile(
            "\\b(((ht|f)tp(s?)\\:\\/\\/|~\\/|\\/)|www.)" + 
            "(\\w+:\\w+@)?(([-\\w]+\\.)+(com|org|net|gov" + 
            "|mil|biz|info|mobi|name|aero|jobs|museum" + 
            "|travel|[a-z]{2}))(:[\\d]{1,5})?" + 
            "(((\\/([-\\w~!$+|.,=]|%[a-f\\d]{2})+)+|\\/)+|\\?|#)?" + 
            "((\\?([-\\w~!$+|.,*:]|%[a-f\\d{2}])+=?" + 
            "([-\\w~!$+|.,*:=]|%[a-f\\d]{2})*)" + 
            "(&(?:[-\\w~!$+|.,*:]|%[a-f\\d{2}])+=?" + 
            "([-\\w~!$+|.,*:=]|%[a-f\\d]{2})*)*)*" + 
            "(#([-\\w~!$+|.,*:=]|%[a-f\\d]{2})*)?\\b");

        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            result.add(matcher.group());
        }

        return result;
    }
	
	public static String[] extracDdomainOfUrls(String input[]) {
		
		String partOne = null;
		String partTwo = null;
		String domain[] = new String[input.length];
		for(int i=0; i<input.length; i++) {
			if(input[i].contains("//")) {
			String str[] = input[i].split("//");
			partOne = str[0];
			partTwo = str[1];
			}
			if(partTwo.contains("/")) {
				String st[] = partTwo.split("/");
				domain[i] = partOne + "//" + st[0];
			}else {
				domain[i] = partOne + "//" + partTwo;
			}
		}
		return domain;
	}
	
	public static List<String> extractDate(String input) {
        List<String> result = new ArrayList<String>();

        Pattern pattern = Pattern.compile(
        		"([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))");

        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            result.add(matcher.group());
        }

        return result;
    }

}
