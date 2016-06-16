import javax.swing.*;

public class UsersCardsField {
	
	private JTextField field;
	private JLabel label;
	private JPanel panel;
	
	public UsersCardsField(){
		label = new JLabel("My cards (syntax: XXs or XXo or pairs): ");
		field = new JTextField("CARDS",5);
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.setSize(100, 50);
		
		panel.add(label);
		panel.add(field);
	}
	
	public JPanel getPanel(){
		return panel;
	}
	
	public String getText(){
		return field.getText();
	}
}
