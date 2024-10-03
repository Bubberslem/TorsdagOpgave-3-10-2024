public class Main{
	public static void main(String[] args){
	Team team1 = new Team("The Groupchat");
	team1.setRank(1);
	team1.addPlayer("Marcus");
	team1.addPlayer("Kreiner");
	team1.addPlayer("Mads");
	System.out.println(team1);
	
	Team team2 = new Team("The Gremlins");
	team2.setRank(2);
	team2.addPlayer("Benjamin");
	team2.addPlayer("Branco");
	team2.addPlayer("Jimmy");
	System.out.println(team2);
	
	Team team3 = new Team("The Gamers");
	team3.setRank(3);
	team3.addPlayer("Kiko");
	team3.addPlayer("Sivas");
	team3.addPlayer("Ozzy");
	System.out.println(team3);
	
	Team team4 = new Team("The Geniuses");
	team4.setRank(4);
	team4.addPlayer("Lamin");
	team4.addPlayer("Ardit");
	team4.addPlayer("Mas");
	System.out.println(team4);
	
	Team team5 = new Team("The Gangstas");
	team5.setRank(5);
	team5.addPlayer("Kesi");
	team5.addPlayer("Bob");
	team5.addPlayer("Bobby");
	System.out.println(team5);
	}
}