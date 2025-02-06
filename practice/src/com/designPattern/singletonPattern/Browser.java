package com.designPattern.singletonPattern;

public class Browser {
	//1. private static instance of the class
	private static Browser browser;
	
	//2. private constructor to prevent/avoid instantiation object
	private Browser() {
		
	}
	
	//3. public static getInstance method to provide access to the instance/object
	public static Browser getInstance() {
		if(browser == null) {
			synchronized (Browser.class) {
				if(browser == null) {
					browser = new Browser();
				}
			}
		}
		return browser;
	}
	
	//individual public method of the class
	public void displayMesg() {
		System.out.println("Browser info");
	}

}
