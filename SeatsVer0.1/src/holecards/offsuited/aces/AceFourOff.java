package holecards.offsuited.aces;

import holecards.HoleCards;

public class AceFourOff extends HoleCards {
	private int numberOfCombinations;
	private int numberOfCards;
	
	public AceFourOff(){
		numberOfCombinations = 28;
		numberOfCards = 8;
	}

	public void removeCard() {
		numberOfCards--;
		if(numberOfCards > 1){
			numberOfCombinations = ( numberOfCards * (numberOfCards-1) )/2;
		}
		else
			numberOfCombinations = 0;
	}

	public int getNumOfCombinations() {
		return numberOfCombinations;
	}

}