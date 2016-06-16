import javax.swing.*;
import java.awt.event.*;

public class Interface {
	private JFrame frame;
	private JPanel mainPanel;
	private InputPanel IP;
	private JButton button;
	private JPanel resultPanel;
	private JLabel resultLabel;
	
	public Interface(){}
	
	public void go(){
		frame = new JFrame();
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		IP = new InputPanel();
		
		mainPanel.add(IP.getPanel());
		
		button = new JButton("Calculate");
		button.addActionListener(new ButtonActionListener());
		
		resultLabel = new JLabel ("No Odds Yet.");
		
		resultPanel = new JPanel();
		resultPanel.add(button);
		resultPanel.add(resultLabel);
		
		mainPanel.add(resultPanel);
		
		frame.getContentPane().add(mainPanel);
		frame.setSize(400,180);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	class ButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			resultPanel.remove(resultLabel);
			resultLabel = new JLabel( "The Odds are: " + IP.getOdds() + "%");
			resultPanel.add(resultLabel);
			mainPanel.validate();
		}
	}
}


