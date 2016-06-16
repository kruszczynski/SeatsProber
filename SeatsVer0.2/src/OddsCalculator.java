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
	
	public void cleanSimulation(){
		situationRange.cleanSimulation();
	}
	
	public void add(int toBeAdded){
		situationRange.addNewCombinations(toBeAdded);
	}
	
	public void remove(int toBeRemoved){
		situationRange.removeCombinations(toBeRemoved);
	}
	
	public String getHandsPercentage(){
		return situationRange.getPercentageString() +" %";
	}
	
	public void removeCards(String str){
		situationRange.remove(str);
	}
	
}
