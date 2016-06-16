package holecards.pairs;

import holecards.*;

public class Eights extends HoleCards{
	private int numberOfCombinations;
	private int numberOfCardsRemoved;
	
	//konstruktor
	public Eights(){
		numberOfCombinations = 6;
		numberOfCardsRemoved = 0;
	}
	
	public int getNumOfCombinations(){
		return numberOfCombinations;
	}
	
	public void removeCard(){
		switch (numberOfCardsRemoved){
		case 0:
			numberOfCombinations=3;
			numberOfCardsRemoved++;
			break;
		case 1:
			numberOfCombinations=1;
			numberOfCardsRemoved++;
			break;
		default:
			numberOfCombinations = 0;
		}
	}
}
