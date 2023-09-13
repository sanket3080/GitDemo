package com.java;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int newScore=calculateScore("Tim", 100);
		System.out.println("New score is: "+newScore);
		
		int newScore2=calculateScore(200);
		System.out.println("New score 2 is : "+newScore2);
		
		System.out.println("New socre 3 is: "+calculateScore());
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player "+playerName+" scored "+score+" points");
		return score*1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unknown player scored "+score+" points");
		return score*100;
		
	}
	
	public static int calculateScore() {
		System.out.println("No player name, no player score.");
		return 0;
		
	}

}
