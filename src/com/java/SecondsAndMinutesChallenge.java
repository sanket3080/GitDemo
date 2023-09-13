package com.java;

public class SecondsAndMinutesChallenge {
	public static void main(String[] args) {
		System.out.println(getDurationString(3945));
		System.out.println(getDurationString(65, 45));
	}
	
	public static String getDurationString(int seconds) {
		int minutes=seconds/60;
		
		return getDurationString(minutes, seconds);
	}
	
	public static String getDurationString(int minutes, int seconds) {
		
		int hours=minutes/60;
		//System.out.println("Hours= "+hours);
		
		int remainingMinutes=minutes%60;
	//	System.out.println("Minutes= "+minutes);
	//	System.out.println("Remaining Minutes= "+remainingMinutes);
		
		int remainingSeconds=seconds%60;
	//	System.out.println("Remaining seconds= "+remainingSeconds);
		
		return hours+"h "+remainingMinutes+"m "+remainingSeconds+"s ";
	}

}
