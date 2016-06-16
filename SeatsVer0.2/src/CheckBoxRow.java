import javax.swing.*;

public class CheckBoxRow {
	
	private CheckBox[] checks;
	
	private JPanel rowPanel;
	
	public CheckBoxRow(int row){
		checks = new CheckBox[13];
		
		rowPanel = new JPanel();
		rowPanel.setLayout(new BoxLayout(rowPanel, BoxLayout.Y_AXIS));
		
		for(int i =12; i>-1; i--){
			HoleCards temp = new HoleCards(row,i+1,i+1>row);
			checks[i] = new CheckBox(temp.getString());
			rowPanel.add(checks[i].getCheckBox());
		}
	}
	
	public JPanel getPanel(){
		return rowPanel;
	}
	
	public boolean isChecked(int col){
		return checks[col-1].isChecked();
	}
	e
	public boolean isSuited(int row,int col){
		if(col>row)
			return true;
		else
			return false;
	}
	
	public void setCheckBox(int col, boolean tick){
		checks[col-1].getCheckBox().setSelected(tick);
	}
}
