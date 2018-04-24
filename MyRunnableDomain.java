package com.finalbuilt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class MyRunnableDomain implements Runnable {
	
	
	//https://www.alexa.com/siteinfo/
	public static List<String> ageOfDomain = new ArrayList<String>();
	public static List<String> dnsRecord = new ArrayList<String>();
	private String url;
	public int i = 0;
	public MyRunnableDomain(String url) {
		this.url = url;
	}

	public void run() {
		
		try {
			URL checkurl = new URL(url);
			URLConnection conn = checkurl.openConnection();
			InputStream fr = conn.getInputStream();
			
			String line = " ";
			BufferedReader br = new BufferedReader(new InputStreamReader(fr));
			while(br.read()!=-1) {
				line = line + br.readLine();
			}
			
			//System.out.println(line);
			List<String> list = PatternExtractor.extractDate(line);
			String y = list.get(1);
			System.out.println(y);
			int year = Integer.parseInt(y.split("-")[0]);
			int mon = Integer.parseInt(y.split("-")[1])-5;
			if(year>2018) {
				ageOfDomain.add("-1");
				dnsRecord.add("-1");
			} else if(mon>=6) {
				ageOfDomain.add("-1");
				dnsRecord.add("-1");
			} else {
				ageOfDomain.add("1");
				dnsRecord.add("-1");
			}
			
		} catch (MalformedURLException e) {
			ageOfDomain.add("1");
			dnsRecord.add("1");
		} catch (IOException e) {
			ageOfDomain.add("1");
			dnsRecord.add("1");
		}
	}

}

