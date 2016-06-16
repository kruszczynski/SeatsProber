import javax.swing.*;

public class InputPanel {
	private JPanel mainPanel;
	
	private JLabel labelOne;
	private JTextField fieldOne;
	private JPanel panelOne;
	
	private JLabel labelTwo;
	private JTextField fieldTwo;
	private JPanel panelTwo;
	
	public InputPanel(){
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
		
		labelOne = new JLabel("Pot (w/o bet): ");
		
		fieldOne = new JTextField(9);
		
		panelOne = new JPanel();
		panelOne.add(labelOne);
		panelOne.add(fieldOne);
		
		mainPanel.add(panelOne);
		
		panelTwo = new JPanel();
		
		labelTwo = new JLabel("Bet: ");
		
		fieldTwo = new JTextField(9);
		
		panelTwo.add(labelTwo);
		panelTwo.add(fieldTwo);
		
		mainPanel.add(panelTwo);
		
	}
	
	public JPanel getPanel(){
		return mainPanel;
	}
	
	public String getOdds(){
		float pot = Float.parseFloat(fieldOne.getText());
		float bet = Float.parseFloat(fieldTwo.getText());
		
		float result = bet/(pot+2*bet)*100;
		
		return String.format( "%2.2f" , result);
	}
}
