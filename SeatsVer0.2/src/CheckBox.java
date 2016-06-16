import javax.swing.*;
import java.awt.event.*;


public class CheckBox {
	private JCheckBox checkBox;
	private boolean isChecked = false;
	
	public CheckBox(String name){
		checkBox = new JCheckBox(name);
		checkBox.setSelected(false);
		checkBox.addItemListener(new CheckBoxItemListener());
	}
	
	public boolean isChecked(){
		return isChecked;
	}
	
	public JCheckBox getCheckBox(){
		return checkBox;
	}
	
	
	class CheckBoxItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			isChecked = checkBox.isSelected();
		}
	}
}
