package com.finalbuilt;

public class MainThreadClass implements Runnable {

	private String userName;
	private String userCredentials;
	public MainThreadClass(String user, String pass) {
		this.userName = user;
		this.userCredentials = pass;
	}
	@SuppressWarnings("static-access")
	public void run() {
		while(!Thread.currentThread().interrupted()) {
			EmailAccessUsingImap.call(userName, userCredentials);
		}
	}
		
}
