package holecards.pairs;

import card.*;
import holecards.*;

public class AnyPair extends HoleCards{
	private int numberOfCombinations;
	private int cardsArray[] = new int[13];
	
	//konstruktor
	public AnyPair(){
		numberOfCombinations = 78;
		for(int i = 0; i<13; i++)
			cardsArray[i] = 4;
	}
	
	public int getNumOfCombinations(){
		return numberOfCombinations;
	}
	
	public void removeCard(){}
	
	public void removeCard(Card removedCard){
		int tempInt = removedCard.getFigure().getFigureInt() -1;
		switch (cardsArray[tempInt]){
		case 4:
			cardsArray[tempInt]=3;
			numberOfCombinations-=3;
			break;
		case 3:
			cardsArray[tempInt]=2;
			numberOfCombinations-=2;
			break;
		case 2:
			cardsArray[tempInt]=1;
			numberOfCombinations-=1;
		}
	}
}
