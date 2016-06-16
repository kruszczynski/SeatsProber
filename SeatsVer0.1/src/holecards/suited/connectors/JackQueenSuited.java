package holecards.suited.connectors;

import holecards.*;

public class JackQueenSuited extends HoleCards{
	private int numberOfCombinations;
	private int numberOfLowersRemoved;
	private int numberOfHighersRemoved;
	
	public JackQueenSuited(){
		numberOfCombinations = 4;
		numberOfLowersRemoved = 0;
		numberOfHighersRemoved = 0;
	}

	public void removeCard() {
		if(numberOfCombinations>0){
			numberOfCombinations--;
		}
	}
	
	public void removeHigher(){
		if( numberOfCombinations>0){
			numberOfHighersRemoved++;
			numberOfCombinations = Math.min( (4 - numberOfHighersRemoved ) , (4 -numberOfLowersRemoved));
		}
	}

	public void removeKicker(){
		if( numberOfCombinations>0){
			numberOfLowersRemoved++;
			numberOfCombinations = Math.min( (4 - numberOfHighersRemoved ) , (4 -numberOfLowersRemoved));
		}
	}
	
	
	public int getNumOfCombinations() {
		return numberOfCombinations;
	}
	
}