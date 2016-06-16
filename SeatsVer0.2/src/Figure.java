

public class Figure {
	private int figureInt;
	
	public Figure(int newInt){
		figureInt = newInt;
	}
	
	public int getFigureInt(){
		return figureInt;
	}
	
	public boolean isProper(){
		if( figureInt == 0 ){
			return false;
		}else
			return true;
	}
	
	public String getString(){
		String res = "";
		switch(figureInt){
			case 1:
				res = "2";
				break;
			case 2:
				res = "3";
				break;
			case 3:
				res = "4";
				break;
			case 4:
				res = "5";
				break;
			case 5:
				res = "6";
				break;
			case 6:
				res = "7";
				break;
			case 7:
				res = "8";
				break;
			case 8:
				res = "9";
				break;
			case 9:
				res = "T";
				break;
			case 10:
				res = "J";
				break;
			case 11:
				res = "Q";
				break;
			case 12:
				res = "K";
				break;
			case 13:
				res = "A";
				break;
		}
		
		return res;
	}
	
}
