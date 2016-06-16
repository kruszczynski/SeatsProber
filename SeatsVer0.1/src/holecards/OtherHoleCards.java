package holecards;

import card.*;
import card.figures.*;

public class OtherHoleCards extends HoleCards{
	private int numberOfCombinations;
	
	public OtherHoleCards(Card one, Card two){
		if(!one.equals(two)){
			numberOfCombinations = 1;
		}
	}
	
	public OtherHoleCards(Figure one, Figure two, boolean isSuited){
		if(isSuited)
			numberOfCombinations = 4;
		else
			numberOfCombinations = 16;
	}
	
	
	
	public void removeCard() {
		numberOfCombinations--;		
	}

	public int getNumOfCombinations() {
		return numberOfCombinations;
	}

}
