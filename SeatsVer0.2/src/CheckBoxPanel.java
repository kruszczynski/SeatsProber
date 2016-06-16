import javax.swing.*;
import javax.swing.border.*;

public class CheckBoxPanel {
	
	private JPanel mainPanel;
	
	private CheckBoxRow[] rows;
	
	private int numberOfCombinations = 0;
	
	public CheckBoxPanel(){
		rows = new CheckBoxRow[13];
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.X_AXIS));
		mainPanel.setBorder(new EmptyBorder(20,20,20,20));
		for(int i = 12; i>-1; i--){
			rows[i] = new CheckBoxRow(i+1);
			mainPanel.add(rows[i].getPanel());
		}
	}
	
	public JPanel getPanel(){
		return mainPanel;
	}
	
	public boolean isChecked(int row, int col){
		if(row>0 && col>0)
			return rows[row-1].isChecked(col);
		else
			return false;
	}
	
	public boolean isSuited(int row, int col){
		return rows[row-1].isSuited(row,col);
	}
	
	
	// liczy wszystkie zaznaczone i przypisuje im odpowiednia wartosc
	public int getNumberOfCombinations(){
		
		numberOfCombinations = 0;
		
		for(int i =1;i<14;i++){
			
			for(int j=1;j<14;j++){
				if(isChecked(i,j)){
					
					if(i>j)
						numberOfCombinations+= 16;
					else if(j>i)
						numberOfCombinations+= 4;
					else
						numberOfCombinations+= 6;
					
				}
			}
			
		}
		
		return numberOfCombinations;
	}
	
	
	
	
	//czysci wszystko
	public void clearCheckBoxes(){
		for(int i = 0; i<13;i++){
			
			for(int j = 1; j< 14; j++){
				
				rows[i].setCheckBox(j, false);
				
			}
		}
	}
	
	// zaznacza pary
	
	public void selectPairs(boolean tick){
		for(int i = 1;i<14;i++){
			
			rows[i-1].setCheckBox(i, tick);
			
		}
	}
	
	public void selectBroadways(boolean tick){
		
		for(int i = 13; i>8; i--){
			
			for(int j = 13; j > 8; j--){
				
				rows[i-1].setCheckBox(j, tick);
				
			}
		}
		
	}
	
	
	
	
}
