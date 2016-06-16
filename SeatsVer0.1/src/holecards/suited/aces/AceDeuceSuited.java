package holecards.suited.aces;

import holecards.HoleCards;

public class AceDeuceSuited extends HoleCards {
	private int numberOfCombinations;
	private int numberOfAcesRemoved;
	private int numberOfKickersRemoved;
	
	public AceDeuceSuited(){
		numberOfCombinations = 4;
		numberOfAcesRemoved = 0;
		numberOfKickersRemoved = 0;
	}

	public void removeCard() {
		if(numberOfCombinations>0){
			numberOfCombinations--;
		}
	}
	
	public void removeAce(){
		if( numberOfCombinations>0){
			numberOfAcesRemoved++;
			numberOfCombinations = Math.min( (4 - numberOfAcesRemoved ) , (4 -numberOfKickersRemoved));
		}
	}

	public void removeKicker(){
		if( numberOfCombinations>0){
			numberOfKickersRemoved++;
			numberOfCombinations = Math.min( (4 - numberOfAcesRemoved ) , (4 -numberOfKickersRemoved));
		}
	}
	
	
	public int getNumOfCombinations() {
		return numberOfCombinations;
	}

}
