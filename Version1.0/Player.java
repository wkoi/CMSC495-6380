class Player {

 private String name;
 private int wins;
 private int losses;
 private float rank;
 private int games;
 private int no;

 //set Player name
 public void setName(String name){
  this.name= name;
 }

 //retrieve Player name
 public String getName(){
  return name;
 }
 
 //set wins
 public void setWins(int wins){
  this.wins= wins;
 }
 //retrieve wins
 public int getWins(){
  return wins;
 }
 //set losses
 public void setLosses(int losses ){
  this.losses = losses;
 }
 //retrieve losses
 public int getLosses(){
  return losses;
 }

 //get Player rank
 public float getRank(){
  return rank;
 }
 //set Player rank
 public void setRank(float rank){
  this.rank= rank;
 }
//retrieve games number
public int getGames(){
  return games;
 }
 //set games number
 public void setGames(int games){
  this.games= games;
 } 
 //retrieve number of Player
 public int getNo(){
  return no;
 }
 //set number of Players
 public void setNo(int no){
  this.no= no;
 }

//Player class constructor
 public Player(){  // System.out.println ( "New tennis Player created");
	}
}
