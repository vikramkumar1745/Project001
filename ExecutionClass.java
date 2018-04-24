package com.finalbuilt;

public class ExecutionClass {
	
	static Thread thread1 = null;
	public static void startExecution(String user,String pass) {
		MainThreadClass thr = new MainThreadClass(user,pass);
		thread1 = new Thread(thr);
		thread1.start();
	}
}
