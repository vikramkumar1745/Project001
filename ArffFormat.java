package com.finalbuilt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class ArffFormat {
	
	public static int count = 0;
	
	public static final String FORMAT =  "@relation phishingurls\r\n" + 
			"\r\n" + 
			"@attribute having_IP_Address  { -1,1 }\r\n" + 
			"@attribute URL_Length   { 1,0,-1 }\r\n" + 
			"@attribute Shortining_Service { 1,-1 }\r\n" + 
			"@attribute having_At_Symbol   { 1,-1 }\r\n" + 
			"@attribute double_slash_redirecting { -1,1 }\r\n" + 
			"@attribute Prefix_Suffix  { -1,1 }\r\n" + 
			"@attribute having_Sub_Domain  { -1,0,1 }\r\n" + 
			"@attribute SSLfinal_State  { -1,1,0 }\r\n" + 
			"@attribute Domain_registeration_length { -1,1 }\r\n" + 
			"@attribute port { 1,-1 }\r\n" + 
			"@attribute HTTPS_token { -1,1 }\r\n" + 
			"@attribute Request_URL  { 1,-1 }\r\n" + 
			"@attribute age_of_domain  { -1,1 }\r\n" + 
			"@attribute DNSRecord   { -1,1 }\r\n" + 
			"\r\n" + 
			"@data" +
			"\r\n";
		public static void writeToDataFile(List<String> data) {
			
			Writer writer = null;
			BufferedWriter br = null;
			count = 0;
			try {
				writer = new FileWriter("D:\\Eclipse\\FinalBuilt\\src\\com\\finalbuilt\\Data.arff");
				br = new BufferedWriter(writer);
				br.write(FORMAT);
				for (int i = 0; i < data.size(); i++) {
					br.write(data.get(i));
					br.write("\r\n");
					count++;
				}
				br.flush();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(br!=null) {
					br.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					if(writer!=null) {
					writer.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Total emails = " + count);
			
		}

}
