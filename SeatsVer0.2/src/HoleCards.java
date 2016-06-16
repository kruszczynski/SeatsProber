public class HoleCards {
	private Figure figOne;
	private Figure figTwo;
	private boolean isSuited;
//	private boolean chk = false;
	
	public HoleCards(){
		
	}
	
	public HoleCards(int one, int two, boolean suited){
		figOne = new Figure(one);
		figTwo = new Figure(two);
		isSuited = suited;
//		chk = true;
	}
	

	public String getString(){
		String suited;
		if(isSuited)
			suited = "s";
		else if(figOne.getFigureInt()==figTwo.getFigureInt())
			suited = "";
		else
			suited = "o";
		return figOne.getString() + figTwo.getString()+suited;
	}
}
