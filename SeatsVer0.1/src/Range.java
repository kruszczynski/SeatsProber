//import card.Card;



public class Range {
	final float allPossibleCombinations = 1326;
	private int currentSimulationCombinations;
//	private Card[] myCards = new Card[2];
	private float result = 0;
	
	public Range(){
		currentSimulationCombinations = 0;
	}
	
	public void addNewCombinations(int toBeAdded){
		currentSimulationCombinations += toBeAdded;
		System.out.println(currentSimulationCombinations);
	}
	
	public void removeCombinations(int toBeRemoved){
		if(currentSimulationCombinations >=toBeRemoved)
			currentSimulationCombinations -= toBeRemoved;
	}
	
	public void calculate(int a){
		float temp = (allPossibleCombinations-currentSimulationCombinations)/allPossibleCombinations;
		float temp2=1;
		for(int i=0; i<a;i++){
		temp2 = temp2*temp;}
		result = 100*(1-temp2);
	}
	
	public String getOddsString(){
		return String.format("The odds are: %.2f", result);
	}
}
