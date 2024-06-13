package com.test;
import com.electronics.*;


public class Main {
	public static void main(String [] args) {
		SmartPhone sm = new SmartPhone("mi", "y2");
		sm.powerOn();
		sm.connectToWiFi();
		sm.makeCall();
		
		
		
	}

}
