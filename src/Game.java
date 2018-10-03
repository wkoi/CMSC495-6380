/*
 * File Name:		Game.java
 * Class:			CMSC 495-6380
 * Group:			Group 6
 * Authors:			J. Zach
 * Date:			9/25/2018
 * Purpose:			This class digests the data input into the program and parses it out to different parts of the program.
 * 					It is also responsible for performing the operations to calculate victories and rankings for the games.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Game {
	
	String gameName;
	int gamesInASeason;
	File gameFile;
	ArrayList<Player> playerList = new ArrayList<Player>();
	
	/*
	 * Default Constructor built with default values
	 */
	Game(){
		gameName = "Tennis";
		gamesInASeason = 16;
	}
	
	/*
	 * Game Constructor
	 * 
	 * @param	newGameFile - New file for the program to read in
	 * @param	newGameName - New name for the game being played
	 */
	Game(File newGameFile, String newGameName, int newGamesInASeason){
		gameFile = newGameFile;
		gameName = newGameName;
		gamesInASeason = newGamesInASeason;
	}
	
	/*
	 * This method parses through a given file to extract data for the 
	 * program or rejecting faulty files
	 * 
	 * @param	File newFile - File to be read into the program
	 */
	public void parseFile(File newFile){
		
		try(BufferedReader br = new BufferedReader(new FileReader(newFile))){
			
			//Pending a legit file, these variables will be transfered to the global variables
			String tempGameType;
			int tempNumberOfTeams, tempGamesPerSeason;
			ArrayList<Player> tempPlayerList = new ArrayList<Player>();
			
			//Serve as checks to see if the information was already gathered, one perfile otherwise
			//the file is
			boolean gameTypeReceived, gamesPerSeasonReceived, NumberOfTeamsReceived;
			
			String line = null;								//line to parse from file
			
			while((line = br.readLine()) != null){
				
				String tokens[] = line.split(",");
				
				//System.out.println(line);					//Testing print system
				if(tokens[0].charAt(0) == '>'){
					continue;
				}//Just a comment, do nothing, move on
				else if(tokens[0].equalsIgnoreCase("GameType")){
					
				}//Game Type Line
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/*
	 * This method should play through one whole season or finish a
	 * season out if it had already been started.
	 */
	public void playSeason(){
		//Play through the remainder of the season or from the start
	}
	
	/*
	 * This method should play through one week of the season
	 */
	public void playWeek(){
		//Play through a week of the game
	}
	
	/*
	 * This method plays a game and adjusts the points between the players
	 * 
	 * @param	home the home player
	 * @param	away the away player
	 */
	public void playGame(Player home, Player away){
		//Set variables for the two players and have them go 
		//up against each other.
	}
	
	/*
	 * This method adds a player to the player array list
	 * 
	 * @param	newPlayer player to be added
	 */
	public void addPlayerToGame(Player newPlayer){
		playerList.add(newPlayer);
	}
	
	/*
	 * Class to get the game name
	 * 
	 * @return gameName
	 */
	public String getGameName(){
		return gameName;
	}
	
	/*
	 * Class to get the number of games in a season
	 * 
	 * @return gamesInASeason
	 */
	public int getGamesInASeason(){
		return gamesInASeason;
	}
	
	
	
	
}
