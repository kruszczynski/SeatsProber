import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

import javax.swing.border.EmptyBorder;


public class GUI {
	
	private OddsCalculator calculator = new OddsCalculator();
	private JFrame frame;
	
	private JButton calculateButton;
	private JLabel resultLabel;
	private JLabel percentageLabel;
	private JPanel resultPanel;
	
	private JPanel topPanel;
	private JPanel topestPanel;
	
//	private JCheckBox includeBox;
	
	private UsersCardsField ucf;
	
	private PlayerButtonsPanel pbp;
	
	private CheckBoxPanel cbp;
	
	private JButton clearButton;
	private JButton allPairsButton;
	private JButton allBroadwaysButton;
	
	private boolean topChecked = false;
	
	private StringConversionHelper sch;
//	private JMenuBar menubar;
	
	
	public void go(){
		frame = new JFrame("K's Simple Poker Calc");
		
	
		
		topPanel = new JPanel();
		topPanel.setLayout(new BoxLayout(topPanel,BoxLayout.Y_AXIS));
		
		pbp = new PlayerButtonsPanel();
		ucf = new UsersCardsField();
		
		topestPanel = new JPanel();
	//	topestPanel.add(BorderLayout.CENTER,topestPanel);
		
//		includeBox = new JCheckBox("include hole cards");
//		includeBox.addItemListener(new IncludeBoxItemListener());

		topestPanel.add(ucf.getPanel());
//		topestPanel.add(includeBox);
		
		topPanel.add(topestPanel);
		topPanel.add(pbp.getPanel());
		
		calculator.setPlayersLeft(pbp.getNumberOfPlayers());
	
		calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new calculateButtonListener());
		
		resultLabel = new JLabel();
		percentageLabel = new JLabel();
		resultPanel = new JPanel();
		resultPanel.setBorder(new EmptyBorder(0,0,20,0));
		resultPanel.add(calculateButton);
		resultPanel.add(resultLabel);
		
		cbp = new CheckBoxPanel();
		
		
		clearButton = new JButton("Clear");
		clearButton.addActionListener(new clearButtonListener());
		
		allPairsButton = new JButton("All pairs");
		allPairsButton.addActionListener(new allPairsListener());
		
		allBroadwaysButton = new JButton("All broadways");
		allBroadwaysButton.addActionListener(new allBroadwaysListener());
		
		resultPanel.add(clearButton);
		resultPanel.add(allPairsButton);
		resultPanel.add(allBroadwaysButton);
		resultPanel.add(calculateButton);
		resultPanel.add(resultLabel);
		resultPanel.add(percentageLabel);
		
		frame.getContentPane().add(BorderLayout.SOUTH,resultPanel);
		frame.getContentPane().add(BorderLayout.NORTH,topPanel);
		frame.getContentPane().add(BorderLayout.CENTER, cbp.getPanel());		
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public int num2Remove(){
		int a = sch.getCardInt(1);
		int b = sch.getCardInt(2);
		int ret =0;
		if(a!=b){
			if(sch.isSuited()){
				if(cbp.isChecked(Math.min(a, b), Math.max(a,b)))
					ret = 1;
			}
			else{
				if( cbp.isChecked(Math.max(a,b), Math.min(a,b)))
					ret = 7;
			}
		}else{
			if( cbp.isChecked(a,b))
				ret = 3;
		}
		
		return ret;
	}
	
	class calculateButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			calculator.setPlayersLeft(pbp.getNumberOfPlayers());
			calculator.cleanSimulation();
			calculator.add(cbp.getNumberOfCombinations());
	//		if(topChecked){
				sch = new StringConversionHelper(ucf.getText());
				calculator.remove(num2Remove());
	//		}
			calculator.calculateOdds();
			resultPanel.remove(resultLabel);
			resultPanel.remove(percentageLabel);
			resultLabel = new JLabel(calculator.getOdds());
			percentageLabel = new JLabel(calculator.getHandsPercentage());
			resultPanel.add(resultLabel);
			resultPanel.add(percentageLabel);
			resultPanel.validate();
		}
	}
	
	class clearButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			cbp.clearCheckBoxes();
		}
	}
	
	class allPairsListener implements ActionListener{
		boolean clicked = false;
		public void actionPerformed(ActionEvent e){
			if(clicked){
				cbp.selectPairs(false);
				clicked = false;
			}else{
				cbp.selectPairs(true);
				clicked = true;
			}
		}
	}
	
	class allBroadwaysListener implements ActionListener{
		boolean clicked = false;
		public void actionPerformed(ActionEvent e){
			if(clicked){
				cbp.selectBroadways(false);
				clicked = false;
			}else{
				cbp.selectBroadways(true);
				clicked = true;
			}
		}
	}

/*
	class IncludeBoxItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			topChecked = includeBox.isSelected();
		}
	}*/
	
}



