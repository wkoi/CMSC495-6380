<<<<<<< HEAD
import java.util.*;
public class Player {
	String name;
	int winCount;
	int lossCount;
	int rank;

	Player(Scanner sc){
	if (sc.hasNext()){
		name = sc.next();
	}
	if (sc.hasNext()){
		rank = sc.nextInt();
	}	
	
	}
=======
/*
 * File Name:		Player.java
 * Class:		CMSC 495-6380
 * Group:		Group 6
 * Authors:		Will Krohn, Stephen
 * Date: 		9/29/2018
 * Purpose: 		This document is responsible for the Player java class for group 6's project to predict wins
 */
import java.util.*;
import java.util.Scanner;

public class Player {
	String name;
	int winCount, lossCount, rank;
	
	Player(Scanner sc){
		if (sc.hasNext()){
			name = sc.next();
		}
		if (sc.hasNext()){
			rank = sc.nextInt();
		}	
	
	}
	
>>>>>>> 066203684f2f8ee88a122ae9d31c58e4c602d318
	int getRank(){
		return rank;
	}

<<<<<<< HEAD
	

=======
>>>>>>> 066203684f2f8ee88a122ae9d31c58e4c602d318
	void setRank(int rank){
		this.rank = rank;
	}

	void setwinCount(int winCount){
		this.winCount = winCount;
	}

	void setlossCount
	(int lossCount){
		this.lossCount = lossCount;

	}

	int getwinCount(){
		return winCount;
	}
	int getlossCount
	(){
		return lossCount;

	}
	void resetwinCountlossCount
	(){
		winCount = 0;
		lossCount  = 0;
	}
	String getName(){
		return name;
	}
	void setName(String newName){
		newName = name;
	}

}
