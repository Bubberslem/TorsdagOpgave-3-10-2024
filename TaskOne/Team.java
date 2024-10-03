import java.util.ArrayList;

public class Team{
	private String teamName;
	private int rank;
	private ArrayList<String> players;
	
	public Team(String teamName){
		this.teamName = teamName;
		this.players = new ArrayList<>();
		
	}
	public void setRank(int rank){
		this.rank = rank;
	}
	@Override
	public String toString(){
		String teamDetails = "Hold: " + this.teamName + "\nRang: " + this.rank + "\nSpillere:\n";
		for(String player : this.players){
			teamDetails += player + "\n";
			}
		return teamDetails;
	}
	public void addPlayer(String playerName){
		this.players.add(playerName);
	}
	
}