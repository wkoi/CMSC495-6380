import java.util.Scanner;

/*This document is responsible for the Player java class for group 6's project to predict wins
 * Author: Will Krohn
 * Version Number(dates): 1.0(9/29/18)
 */
public class Player {
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
	int getRank(){
		return rank;
	}

	

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

	String name;
	int wins,losses,rank;
	Player(Scanner sc){
		if(sc.hasNext()) {
			name=sc.next();
			if(sc.hasNextInt()) {
				rank=sc.nextInt();
			}
		}
		else {
			//Here for later development for catching bad data
		}
	}
	//Gets Player Name
	public String getName() {
		return name;
	}
	//Set Player name
	public void setName(String n) {
		name=n;
	}
	//Gets player Rank
	public int getRank() {
		return this.rank;
	}
	//Set rank
	public void setRank(int r) {
		this.rank=r;
	}
	//Set Wins
	public void setWins(int w) {
		wins=w;
	}
	//Set Losses
	public void setLosses(int l) {
		losses=l;
	}
	//returns wins
	public int getWins() {
		return wins;
	}
	//returns losses
	public int getLosses() {
		return losses;
	}
	//Resets Player Season
	public void resetSeason(){
		wins=0;
		losses=0;
	}
	
}
