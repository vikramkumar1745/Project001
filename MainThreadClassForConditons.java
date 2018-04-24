package com.finalbuilt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThreadClassForConditons {
	
	private static String whois = "https://www.whois.com/whois/";
	@SuppressWarnings("static-access")
	public static void validatedDomain(String domaminab[]) {
		String[] DOMAIN = domaminab;
		System.out.println(DOMAIN.length);
				
		String urlslist[] = new String[DOMAIN.length];
		for (int i = 0; i < urlslist.length; i++) {
			urlslist[i] = whois + DOMAIN[i];
		}
		
		final int LEN = DOMAIN.length;
		if(LEN!=0) {
		ExecutorService execute = Executors.newFixedThreadPool(LEN);
		
		for (String string : urlslist) {
			Runnable ref = new MyRunnableDomain(string);
			execute.execute(ref);
		}
		
		execute.shutdown();
		while (!execute.isTerminated()) {
			
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < urlslist.length; i++) {
			System.out.print(MyRunnableDomain.ageOfDomain.get(i)+",");
		}
		}
		System.out.println("\nFinished all threads");		
	}

}
