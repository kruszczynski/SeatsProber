package card;

import card.figures.*;
import card.suits.*;


public class Card {
	private Suit suit;
	private Figure figure;

	//konstruktor
	public Card( Suit newSuit, Figure newFigure){
		suit = newSuit;
		figure = newFigure;
	}
	
	// kontruktory zbiorow kart o okreslonej wartosci lub figurze
	public Card( Suit newSuit){
		suit = newSuit;
		figure = new AnyFigure();
	}
	public Card( Figure newFigure){
		suit = new AnySuit();
		figure = newFigure;
	}
	
	// i boolczekery do tego
	public boolean isAnySuit(){
		return suit.getSuitInt() == 0;
	}
	public boolean isAnyFigure(){
		return figure.getFigureInt() == 0;
	}
	
	public Suit getSuit(){
		return suit;
	}
	
	public Figure getFigure(){
		return figure;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((figure == null) ? 0 : figure.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (figure == null) {
			if (other.figure != null)
				return false;
		} else if (!figure.equals(other.figure))
			return false;
		if (suit == null) {
			if (other.suit != null)
				return false;
		} else if (!suit.equals(other.suit))
			return false;
		return true;
	}
	
	
	

}