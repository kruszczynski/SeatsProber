import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;


public class PlayerButtonsPanel {
	
	private JPanel playersLabelPanel;
	private JPanel buttonsPanel;
	private JPanel mainPanel;
	
	private int numOfPlrs;
	
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	
	private JLabel playersLabel;
	
	public PlayerButtonsPanel(){
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		playersLabelPanel = new JPanel();
		playersLabelPanel.setBorder(new EmptyBorder(10,0,0,0));
		
		playersLabel = new JLabel("Players left:");
		playersLabelPanel.add(playersLabel);
		
		mainPanel.add(playersLabelPanel);
		
		buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.X_AXIS));
		
		b1 = new JButton("1");
		b1.addActionListener(new B1ActionListener());
		buttonsPanel.add(b1);

		b2 = new JButton("2");
		b2.addActionListener(new B2ActionListener());
		buttonsPanel.add(b2);

		b3 = new JButton("3");
		b3.addActionListener(new B3ActionListener());
		buttonsPanel.add(b3);

		b4 = new JButton("4");
		b4.addActionListener(new B4ActionListener());
		buttonsPanel.add(b4);

		b5 = new JButton("5");
		b5.addActionListener(new B5ActionListener());
		buttonsPanel.add(b5);

		b6 = new JButton("6");
		b6.addActionListener(new B6ActionListener());
		buttonsPanel.add(b6);

		b7 = new JButton("7");
		b7.addActionListener(new B7ActionListener());
		buttonsPanel.add(b7);

		b8 = new JButton("8");
		b8.addActionListener(new B8ActionListener());
		buttonsPanel.add(b8);

		b9 = new JButton("9");
		b9.addActionListener(new B9ActionListener());
		buttonsPanel.add(b9);
		
		mainPanel.add(buttonsPanel);
	}
	
	public int getNumberOfPlayers(){
		return numOfPlrs;
	}
	
	public JPanel getPanel(){
		return mainPanel;
	}
	
	class B1ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			playersLabel = new JLabel("Players left: 1");
			numOfPlrs = 1;
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}

	class B2ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			playersLabel = new JLabel("Players left: 2");
			numOfPlrs = 2;
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}

	class B3ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			playersLabel = new JLabel("Players left: 3");
			numOfPlrs = 3;
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}

	class B4ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			playersLabel = new JLabel("Players left: 4");
			numOfPlrs = 4;
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}

	class B5ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			playersLabel = new JLabel("Players left: 5");
			numOfPlrs = 5;
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}

	class B6ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			playersLabel = new JLabel("Players left: 6");
			numOfPlrs = 6;
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}

	class B7ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			playersLabel = new JLabel("Players left: 7");
			numOfPlrs = 7;
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}

	class B8ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			playersLabel = new JLabel("Players left: 8");
			numOfPlrs = 8;
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}

	class B9ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			playersLabel = new JLabel("Players left: 9");
			numOfPlrs = 9;
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}
}
