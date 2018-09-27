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
