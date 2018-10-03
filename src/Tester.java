import java.io.File;

/*
 * File Name:		Tester.java
 * Class:			CMSC 495-6380
 * Group:			Group 6
 * Authors:			J. Zach
 * Date:			9/25/2018
 * Purpose:			This class will hold the testing materials and code to ensure the program works.
 */
public class Tester {
	public static void main(String args[]){
		Game run = new Game();
		Player player1 = new Player("Zach", 50);
		Player player2 = new Player("Stephen", 50);
		Player player3 = new Player("Sheldon", 50);
		Player player4 = new Player("Will", 50);
		run.addPlayerToGame(player1);
		run.addPlayerToGame(player2);
		run.addPlayerToGame(player3);
		run.addPlayerToGame(player4);
		File testFile1 = new File("TestData.txt");
		run.parseFile(testFile1);
	}	
}
