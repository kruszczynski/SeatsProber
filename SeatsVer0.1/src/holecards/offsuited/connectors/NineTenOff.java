package holecards.offsuited.connectors;

import holecards.*;

public class NineTenOff extends HoleCards{
	private int numberOfCombinations;
	private int numberOfCards;
	
	public NineTenOff(){
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
