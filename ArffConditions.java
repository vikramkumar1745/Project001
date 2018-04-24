package com.finalbuilt;

public class ArffConditions {

	static String one = "1";
	static String two = "-1";
	static String three = "-1";
	static String four = "-1";
	static String five = "-1";
	static String six = "-1";
	static String seven = "-1";
	static String eight = "0";
	static String ten = "1";
	static String eleven = "1";
	static String twelve = "-1";
	static String thirteen = "1";
	
	public static String checkCondition(String url,String emailDomain,String domainOfSender) {
		
		String protocol = emailDomain.split("//")[1];
		String domain = emailDomain.split("//")[1];
		String queryString = " ";
		if(url.contains("//")) {
		if(url.split("//")[1].contains("/")) {
			queryString = url.split("//")[1].split("/")[1];
		}
		}
		
		//1.checking ipaddress
		int count = 0;
		char ipaddr[] = domain.toCharArray();
		for(int i=0; i<ipaddr.length; i++) {
			if(ipaddr[i]>47 && ipaddr[i]<57)
				count++;
		}
		if(count>6) {
			one = "-1";
		}
		
		//2.LongUrl
		int urllen = url.length();
		if(urllen>75) {
			two = "1";
		} else if(urllen>=54  && urllen<=75) {
			two = "0";
		}
		
		//3.tinyurl
		if(url.contains("tiny") || url.contains("goo") || url.contains("short") || url.contains("bit")) {
			three = "1";
		}
		
		//4.containing @ symbol
		if(url.contains("@")) {
			four = "1";
		}
		
		//5.checking redirecting
		
		if(queryString.contains("//") && queryString!=null) {
			five = "1";
		} 
		
		//6.prefix and suffix seperated by "-"
		if(url.contains("-")) {
			six = "1";
		}
		
		//7.Doamin and multisub-domain
		count = 0;
		String checkdomain [] = domain.split(".");
		int domlen = checkdomain.length-1;
		if(domlen==2) {
			seven = "0";
		} else if(domlen>2) {
			seven = "1";
		}
		
		//8.contains https
		if(protocol.contains("https")) {
			eight = "1";
		}
		
		//9.domainRegistration length
		
		
		//10.fevicon
		for(int i=0; i<domlen-1; i++) {
		if(domainOfSender.contains(checkdomain[i])) {
			ten = "-1";
		}
		}
		
		//11.using non standard port
		if(protocol.contains("http") || protocol.contains("https")) {
			eleven = "-1";
		}
		
		//12.The Existence of “HTTPS” Token in the Domain Part of the URL
		if(protocol.contains("http")) {
			twelve = "1";
		}
		
		//13.Request URL
		if((queryString.contains("jpg") || queryString.contains("jpeg")) && queryString!=null) {
			if(ten=="1") {
				thirteen = "-1";
			}
		}
		
		//14.URL of Anchor
		
		//return
		return one+","+two+","+three+","+four+","+five+","+six+","+seven+","+eight+","+ten+","+eleven+","+twelve+","+thirteen;
	}

}

