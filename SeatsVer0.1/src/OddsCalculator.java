import holecards.*;

public class OddsCalculator{
	private Range situationRange = new Range();
	private int playersLeft = 1;
	
	public void calculateOdds(){
		situationRange.calculate(playersLeft);
	}
	
	public void setPlayersLeft(int a){
		if(a>0&&a<10)
			playersLeft = a;
	}
	
	public String getOdds(){
		return situationRange.getOddsString()+" %";
	}
	
	public void add(HoleCards toBeAdded){
		situationRange.addNewCombinations(toBeAdded.getNumOfCombinations());
	}
	
	public void remove(HoleCards toBeRemoved){
		situationRange.removeCombinations(toBeRemoved.getNumOfCombinations());
	}
	
	
}
