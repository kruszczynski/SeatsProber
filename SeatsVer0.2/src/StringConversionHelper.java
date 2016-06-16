
public class StringConversionHelper {
	
	private int a,b;
	private boolean isSuited;
	
	public StringConversionHelper(String str){
		str = str.trim();
		if(str.length() > 1){
			
			a = char2PokerInt(str.charAt(0));
			b = char2PokerInt(str.charAt(1));
			if(a!=b){
				if(str.charAt(2) == 's' )
					isSuited = true;
				else if (str.charAt(2) == 'o')
					isSuited = false;
			}
		}
		else{
			a=0;
			b=0;
			isSuited = false;
		}
	}
	
	public boolean isSuited(){
		return isSuited;
	}
	
	public int char2PokerInt(char c){
		if( c == '2')
			return 1;
		else if ( c == '3')
			return 2;
		else if ( c == '4')
			return 3;
		else if ( c == '5')
			return 4;
		else if ( c == '6')
			return 5;
		else if ( c == '7')
			return 6;
		else if ( c == '8')
			return 7;
		else if ( c == '9')
			return 8;
		else if ( c == 'T' || c == 't' )
			return 9;
		else if ( c == 'J' || c == 'j' )
			return 10;
		else if ( c == 'Q' || c == 'q' )
			return 11;
		else if ( c == 'K' || c == 'k' )
			return 12;
		else if ( c == 'A' || c == 'a' )
			return 13;
		else
			return 0;
	}
	
	public int getCardInt(int n){
		if(n == 1)
			return a;
		else if(n ==2)
			return b;
		else
			return 0;
	}
	
}
