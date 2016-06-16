import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import javax.swing.border.EmptyBorder;
import javax.swing.event.*;

import holecards.pairs.*;
import holecards.broadways.*;
import holecards.offsuited.aces.*;
import holecards.offsuited.connectors.*;
import holecards.suited.aces.*;
import holecards.suited.connectors.*;


public class GUI {
	
	private OddsCalculator calculator = new OddsCalculator();
	private JFrame frame;
	private JPanel mainPanel;
	
	private JButton calculateButton;
	private JLabel resultLabel;
	private JLabel playersLabel;
	private JPanel resultPanel;
	private JPanel playersLabelPanel;
	private JPanel olderTopPanel;
	
	private JPanel topPanel;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;

	private JPanel pairsPanel;

	private JCheckBox deuces;
	private JCheckBox treys;
	private JCheckBox fours;
	private JCheckBox fives;
	private JCheckBox sixes;
	private JCheckBox sevens;
	private JCheckBox eights;
	private JCheckBox nines;
	private JCheckBox tens;
	private JCheckBox jacks;
	private JCheckBox queens;
	private JCheckBox kings;
	private JCheckBox aces;
	
	private JPanel suitedAcesPanel;
	
	private JCheckBox aceDeuceSuited;
	private JCheckBox aceTreySuited;
	private JCheckBox aceFourSuited;
	private JCheckBox aceFiveSuited;
	private JCheckBox aceSixSuited;
	private JCheckBox aceSevenSuited;
	private JCheckBox aceEightSuited;
	private JCheckBox aceNineSuited;
	private JCheckBox aceTenSuited;
	private JCheckBox aceJackSuited;
	private JCheckBox aceQueenSuited;
	private JCheckBox aceKingSuited;
	
	private JPanel offSuitAcesPanel;
	
	private JCheckBox aceDeuceOff;
	private JCheckBox aceTreyOff;
	private JCheckBox aceFourOff;
	private JCheckBox aceFiveOff;
	private JCheckBox aceSixOff;
	private JCheckBox aceSevenOff;
	private JCheckBox aceEightOff;
	private JCheckBox aceNineOff;
	private JCheckBox aceTenOff;
	private JCheckBox aceJackOff;
	private JCheckBox aceQueenOff;
	private JCheckBox aceKingOff;
	
	private JPanel broadwaysPanel;
	
	private JCheckBox jackKingOff;
	private JCheckBox jackKingSuited;
	private JCheckBox tenKingOff;
	private JCheckBox tenKingSuited;
	private JCheckBox tenQueenOff;
	private JCheckBox tenQueenSuited;
	
	
	
	public void go(){
		frame = new JFrame("Kruszczynski seat simulator");
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.X_AXIS));
		
		olderTopPanel = new JPanel();
		olderTopPanel.setLayout(new BoxLayout(olderTopPanel,BoxLayout.Y_AXIS));
		
		playersLabelPanel = new JPanel();
		playersLabelPanel.setBorder(new EmptyBorder(10,0,0,0));
		
		topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		topPanel.setBorder(new EmptyBorder(10,0,0,0));
		playersLabel = new JLabel("Players left: ");
		playersLabelPanel.add(playersLabel);
		olderTopPanel.add(playersLabelPanel);
		
		b1 = new JButton("1");
		b1.addActionListener(new B1ActionListener());
		topPanel.add(b1);

		b2 = new JButton("2");
		b2.addActionListener(new B2ActionListener());
		topPanel.add(b2);

		b3 = new JButton("3");
		b3.addActionListener(new B3ActionListener());
		topPanel.add(b3);

		b4 = new JButton("4");
		b4.addActionListener(new B4ActionListener());
		topPanel.add(b4);

		b5 = new JButton("5");
		b5.addActionListener(new B5ActionListener());
		topPanel.add(b5);

		b6 = new JButton("6");
		b6.addActionListener(new B6ActionListener());
		topPanel.add(b6);

		b7 = new JButton("7");
		b7.addActionListener(new B7ActionListener());
		topPanel.add(b7);

		b8 = new JButton("8");
		b8.addActionListener(new B8ActionListener());
		topPanel.add(b8);

		b9 = new JButton("9");
		b9.addActionListener(new B9ActionListener());
		topPanel.add(b9);
		
		mainPanel.setBorder(new EmptyBorder(10,70,10,70));
		
		pairsPanel = new JPanel();
		pairsPanel.setLayout(new BoxLayout(pairsPanel,BoxLayout.Y_AXIS));
		
		deuces = new JCheckBox("22");
		deuces.setSelected(false);
		deuces.addItemListener(new deucesCheckBoxListener());
		
		treys = new JCheckBox("33");
		treys.setSelected(false);
		treys.addItemListener(new treysCheckBoxListener());
		
		fours = new JCheckBox("44");
		fours.setSelected(false);
		fours.addItemListener(new foursCheckBoxListener());
		
		fives = new JCheckBox("55");
		fives.setSelected(false);
		fives.addItemListener(new fivesCheckBoxListener());
		
		sixes = new JCheckBox("66");
		sixes.setSelected(false);
		sixes.addItemListener(new sixesCheckBoxListener());
		
		sevens = new JCheckBox("77");
		sevens.setSelected(false);
		sevens.addItemListener(new sevensCheckBoxListener());
		
		eights = new JCheckBox("88");
		eights.setSelected(false);
		eights.addItemListener(new eightsCheckBoxListener());
		
		nines = new JCheckBox("99");
		nines.setSelected(false);
		nines.addItemListener(new ninesCheckBoxListener());
		
		tens = new JCheckBox("TT");
		tens.setSelected(false);
		tens.addItemListener(new tensCheckBoxListener());
		
		jacks = new JCheckBox("JJ");
		jacks.setSelected(false);
		jacks.addItemListener(new jacksCheckBoxListener());
		
		queens = new JCheckBox("QQ");
		queens.setSelected(false);
		queens.addItemListener(new queensCheckBoxListener());
		
		kings = new JCheckBox("KK");
		kings.setSelected(false);
		kings.addItemListener(new kingsCheckBoxListener());
		
		aces = new JCheckBox("AA");
		aces.setSelected(false);
		aces.addItemListener(new acesCheckBoxListener());
		
		pairsPanel.add(deuces);
		pairsPanel.add(treys);
		pairsPanel.add(fours);
		pairsPanel.add(fives);
		pairsPanel.add(sixes);
		pairsPanel.add(sevens);
		pairsPanel.add(eights);
		pairsPanel.add(nines);
		pairsPanel.add(tens);
		pairsPanel.add(jacks);
		pairsPanel.add(queens);
		pairsPanel.add(kings);
		pairsPanel.add(aces);
		
		pairsPanel.setBorder(new EmptyBorder(0,0,0,25));
		
		mainPanel.add(pairsPanel);
		
		suitedAcesPanel = new JPanel();
		suitedAcesPanel.setLayout(new BoxLayout(suitedAcesPanel,BoxLayout.Y_AXIS));

		aceDeuceSuited = new JCheckBox("A2s");
		aceDeuceSuited.setSelected(false);
		aceDeuceSuited.addItemListener(new aceDeuceSuitedCheckBoxListener());

		aceTreySuited = new JCheckBox("A3s");
		aceTreySuited.setSelected(false);
		aceTreySuited.addItemListener(new aceTreySuitedCheckBoxListener());

		aceFourSuited = new JCheckBox("A4s");
		aceFourSuited.setSelected(false);
		aceFourSuited.addItemListener(new aceFourSuitedCheckBoxListener());

		aceFiveSuited = new JCheckBox("A5s");
		aceFiveSuited.setSelected(false);
		aceFiveSuited.addItemListener(new aceFiveSuitedCheckBoxListener());

		aceSixSuited = new JCheckBox("A6s");
		aceSixSuited.setSelected(false);
		aceSixSuited.addItemListener(new aceSixSuitedCheckBoxListener());

		aceSevenSuited = new JCheckBox("A7s");
		aceSevenSuited.setSelected(false);
		aceSevenSuited.addItemListener(new aceSevenSuitedCheckBoxListener());

		aceEightSuited = new JCheckBox("A8s");
		aceEightSuited.setSelected(false);
		aceEightSuited.addItemListener(new aceEightSuitedCheckBoxListener());

		aceNineSuited = new JCheckBox("A9s");
		aceNineSuited.setSelected(false);
		aceNineSuited.addItemListener(new aceNineSuitedCheckBoxListener());

		aceTenSuited = new JCheckBox("ATs");
		aceTenSuited.setSelected(false);
		aceTenSuited.addItemListener(new aceTenSuitedCheckBoxListener());

		aceJackSuited = new JCheckBox("AJs");
		aceJackSuited.setSelected(false);
		aceJackSuited.addItemListener(new aceJackSuitedCheckBoxListener());

		aceQueenSuited = new JCheckBox("AQs");
		aceQueenSuited.setSelected(false);
		aceQueenSuited.addItemListener(new aceQueenSuitedCheckBoxListener());

		aceKingSuited = new JCheckBox("AKs");
		aceKingSuited.setSelected(false);
		aceKingSuited.addItemListener(new aceKingSuitedCheckBoxListener());
		
		suitedAcesPanel.add(aceDeuceSuited);
		suitedAcesPanel.add(aceTreySuited);
		suitedAcesPanel.add(aceFourSuited);
		suitedAcesPanel.add(aceFiveSuited);
		suitedAcesPanel.add(aceSixSuited);
		suitedAcesPanel.add(aceSevenSuited);
		suitedAcesPanel.add(aceEightSuited);
		suitedAcesPanel.add(aceNineSuited);
		suitedAcesPanel.add(aceTenSuited);
		suitedAcesPanel.add(aceJackSuited);
		suitedAcesPanel.add(aceQueenSuited);
		suitedAcesPanel.add(aceKingSuited);
		
		suitedAcesPanel.setBorder(new EmptyBorder(0,0,0,25));
		
		mainPanel.add(suitedAcesPanel);
		

		offSuitAcesPanel = new JPanel();
		offSuitAcesPanel.setLayout(new BoxLayout(offSuitAcesPanel,BoxLayout.Y_AXIS));

		aceDeuceOff = new JCheckBox("A2o");
		aceDeuceOff.setSelected(false);
		aceDeuceOff.addItemListener(new aceDeuceOffCheckBoxListener());

		aceTreyOff = new JCheckBox("A3o");
		aceTreyOff.setSelected(false);
		aceTreyOff.addItemListener(new aceTreyOffCheckBoxListener());

		aceFourOff = new JCheckBox("A4o");
		aceFourOff.setSelected(false);
		aceFourOff.addItemListener(new aceFourOffCheckBoxListener());

		aceFiveOff = new JCheckBox("A5o");
		aceFiveOff.setSelected(false);
		aceFiveOff.addItemListener(new aceFiveOffCheckBoxListener());

		aceSixOff = new JCheckBox("A6o");
		aceSixOff.setSelected(false);
		aceSixOff.addItemListener(new aceSixOffCheckBoxListener());

		aceSevenOff = new JCheckBox("A7o");
		aceSevenOff.setSelected(false);
		aceSevenOff.addItemListener(new aceSevenOffCheckBoxListener());

		aceEightOff = new JCheckBox("A8o");
		aceEightOff.setSelected(false);
		aceEightOff.addItemListener(new aceEightOffCheckBoxListener());

		aceNineOff = new JCheckBox("A9o");
		aceNineOff.setSelected(false);
		aceNineOff.addItemListener(new aceNineOffCheckBoxListener());

		aceTenOff = new JCheckBox("ATo");
		aceTenOff.setSelected(false);
		aceTenOff.addItemListener(new aceTenOffCheckBoxListener());

		aceJackOff = new JCheckBox("AJo");
		aceJackOff.setSelected(false);
		aceJackOff.addItemListener(new aceJackOffCheckBoxListener());

		aceQueenOff = new JCheckBox("AQo");
		aceQueenOff.setSelected(false);
		aceQueenOff.addItemListener(new aceQueenOffCheckBoxListener());

		aceKingOff = new JCheckBox("AKo");
		aceKingOff.setSelected(false);
		aceKingOff.addItemListener(new aceKingOffCheckBoxListener());
		
		offSuitAcesPanel.add(aceDeuceOff);
		offSuitAcesPanel.add(aceTreyOff);
		offSuitAcesPanel.add(aceFourOff);
		offSuitAcesPanel.add(aceFiveOff);
		offSuitAcesPanel.add(aceSixOff);
		offSuitAcesPanel.add(aceSevenOff);
		offSuitAcesPanel.add(aceEightOff);
		offSuitAcesPanel.add(aceNineOff);
		offSuitAcesPanel.add(aceTenOff);
		offSuitAcesPanel.add(aceJackOff);
		offSuitAcesPanel.add(aceQueenOff);
		offSuitAcesPanel.add(aceKingOff);
		
		offSuitAcesPanel.setBorder(new EmptyBorder(0,0,0,25));
		
		mainPanel.add(offSuitAcesPanel);
		
		broadwaysPanel = new JPanel();
		broadwaysPanel.setLayout(new BoxLayout(broadwaysPanel,BoxLayout.Y_AXIS));
		broadwaysPanel.setBorder(new EmptyBorder(0,0,0,25));
		
		jackKingOff = new JCheckBox("KJo");
		jackKingOff.setSelected(false);
		jackKingOff.addItemListener(new jackKingOffCheckBoxListener());
		
		jackKingSuited = new JCheckBox("KJs");
		jackKingSuited.setSelected(false);
		jackKingSuited.addItemListener(new jackKingSuitedCheckBoxListener());
		
		tenKingOff = new JCheckBox("KTo");
		tenKingOff.setSelected(false);
		tenKingOff.addItemListener(new tenKingOffCheckBoxListener());
		
		tenKingSuited = new JCheckBox("KTs");
		tenKingSuited.setSelected(false);
		tenKingSuited.addItemListener(new tenKingSuitedCheckBoxListener());
		
		tenQueenOff = new JCheckBox("QTo");
		tenQueenOff.setSelected(false);
		tenQueenOff.addItemListener(new tenQueenOffCheckBoxListener());
		
		tenQueenSuited = new JCheckBox("QTs");
		tenQueenSuited.setSelected(false);
		tenQueenSuited.addItemListener(new tenQueenSuitedCheckBoxListener());
		
		broadwaysPanel.add(jackKingOff);
		broadwaysPanel.add(jackKingSuited);
		broadwaysPanel.add(tenKingOff);
		broadwaysPanel.add(tenKingSuited);
		broadwaysPanel.add(tenQueenOff);
		broadwaysPanel.add(tenQueenSuited);

		mainPanel.add(broadwaysPanel);
		
		calculateButton = new JButton("Calculate!");
		calculateButton.addActionListener(new calculateButtonListener());
		resultLabel = new JLabel();
		resultPanel = new JPanel();
		resultPanel.setBorder(new EmptyBorder(0,0,20,0));
		resultPanel.add(calculateButton);
		resultPanel.add(resultLabel);
		
		olderTopPanel.add(topPanel);
		frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
		frame.getContentPane().add(BorderLayout.SOUTH,resultPanel);
		frame.getContentPane().add(BorderLayout.NORTH,olderTopPanel);
		frame.setSize(825,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	class calculateButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			calculator.calculateOdds();
			resultPanel.remove(resultLabel);
			resultLabel = new JLabel(calculator.getOdds());
			resultPanel.add(resultLabel);
			resultPanel.validate();
		}
	}

	class B1ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			calculator.setPlayersLeft(1);
			playersLabel = new JLabel("Players left: 1");
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}

	class B2ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			calculator.setPlayersLeft(2);
			playersLabel = new JLabel("Players left: 2");
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}

	class B3ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			calculator.setPlayersLeft(3);
			playersLabel = new JLabel("Players left: 3");
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}

	class B4ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			calculator.setPlayersLeft(4);
			playersLabel = new JLabel("Players left: 4");
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}

	class B5ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			calculator.setPlayersLeft(5);
			playersLabel = new JLabel("Players left: 5");
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}

	class B6ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			calculator.setPlayersLeft(6);
			playersLabel = new JLabel("Players left: 6");
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}

	class B7ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			calculator.setPlayersLeft(7);
			playersLabel = new JLabel("Players left: 7");
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}

	class B8ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			calculator.setPlayersLeft(8);
			playersLabel = new JLabel("Players left: 8");
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}

	class B9ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			calculator.setPlayersLeft(9);
			playersLabel = new JLabel("Players left: 9");
			playersLabelPanel.removeAll();
			playersLabelPanel.add(playersLabel);
			playersLabelPanel.validate();
		}
	}
	
	class deucesCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(deuces.isSelected())
				calculator.add(new Deuces());
			else
				calculator.remove(new Deuces());
		}
	}

	class treysCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(treys.isSelected())
				calculator.add(new Treys());
			else
				calculator.remove(new Treys());
		}
	}

	class foursCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(fours.isSelected())
				calculator.add(new Fours());
			else
				calculator.remove(new Fours());
		}
	}

	class fivesCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(fives.isSelected())
				calculator.add(new Fives());
			else
				calculator.remove(new Fives());
		}
	}

	class sixesCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(deuces.isSelected())
				calculator.add(new Sixes());
			else
				calculator.remove(new Sixes());
		}
	}

	class sevensCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(sevens.isSelected())
				calculator.add(new Sevens());
			else
				calculator.remove(new Sevens());
		}
	}

	class eightsCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(eights.isSelected())
				calculator.add(new Eights());
			else
				calculator.remove(new Eights());
		}
	}

	class ninesCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(nines.isSelected())
				calculator.add(new Nines());
			else
				calculator.remove(new Nines());
		}
	}

	class tensCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(tens.isSelected())
				calculator.add(new Tens());
			else
				calculator.remove(new Tens());
		}
	}

	class jacksCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(jacks.isSelected())
				calculator.add(new Jacks());
			else
				calculator.remove(new Jacks());
		}
	}

	class queensCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(queens.isSelected())
				calculator.add(new Queens());
			else
				calculator.remove(new Queens());
		}
	}

	class kingsCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(kings.isSelected())
				calculator.add(new Kings());
			else
				calculator.remove(new Kings());
		}
	}

	class acesCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aces.isSelected())
				calculator.add(new Aces());
			else
				calculator.remove(new Aces());
		}
	}

	class aceDeuceSuitedCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceDeuceSuited.isSelected())
				calculator.add(new AceDeuceSuited());
			else
				calculator.remove(new AceDeuceSuited());
		}
	}

	class aceTreySuitedCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceTreySuited.isSelected())
				calculator.add(new AceTreySuited());
			else
				calculator.remove(new AceTreySuited());
		}
	}

	class aceFourSuitedCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceFourSuited.isSelected())
				calculator.add(new AceFourSuited());
			else
				calculator.remove(new AceFourSuited());
		}
	}

	class aceFiveSuitedCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceFiveSuited.isSelected())
				calculator.add(new AceFiveSuited());
			else
				calculator.remove(new AceFiveSuited());
		}
	}

	class aceSixSuitedCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceSixSuited.isSelected())
				calculator.add(new AceSixSuited());
			else
				calculator.remove(new AceSixSuited());
		}
	}

	class aceSevenSuitedCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceSevenSuited.isSelected())
				calculator.add(new AceSevenSuited());
			else
				calculator.remove(new AceSevenSuited());
		}
	}

	class aceEightSuitedCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceEightSuited.isSelected())
				calculator.add(new AceEightSuited());
			else
				calculator.remove(new AceEightSuited());
		}
	}

	class aceNineSuitedCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceNineSuited.isSelected())
				calculator.add(new AceNineSuited());
			else
				calculator.remove(new AceNineSuited());
		}
	}

	class aceTenSuitedCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceTenSuited.isSelected())
				calculator.add(new AceTenSuited());
			else
				calculator.remove(new AceTenSuited());
		}
	}

	class aceJackSuitedCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceJackSuited.isSelected())
				calculator.add(new AceJackSuited());
			else
				calculator.remove(new AceJackSuited());
		}
	}

	class aceQueenSuitedCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceQueenSuited.isSelected())
				calculator.add(new AceQueenSuited());
			else
				calculator.remove(new AceQueenSuited());
		}
	}

	class aceKingSuitedCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceKingSuited.isSelected())
				calculator.add(new AceKingSuited());
			else
				calculator.remove(new AceKingSuited());
		}
	}
	
	class aceDeuceOffCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceDeuceOff.isSelected())
				calculator.add(new AceDeuceOff());
			else
				calculator.remove(new AceDeuceOff());
		}
	}
	
	class aceTreyOffCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceTreyOff.isSelected())
				calculator.add(new AceTreyOff());
			else
				calculator.remove(new AceTreyOff());
		}
	}
	
	class aceFourOffCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceFourOff.isSelected())
				calculator.add(new AceFourOff());
			else
				calculator.remove(new AceFourOff());
		}
	}

	class aceFiveOffCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceFiveOff.isSelected())
				calculator.add(new AceFiveOff());
			else
				calculator.add(new AceFiveOff());
		}
	}

	class aceSixOffCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceSixOff.isSelected())
				calculator.add(new AceSixOff());
			else
				calculator.remove(new AceSixOff());
		}
	}
	
	class aceSevenOffCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceSevenOff.isSelected())
				calculator.add(new AceSevenOff());
			else
				calculator.remove(new AceSevenOff());
		}
	}
	
	class aceEightOffCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceEightOff.isSelected())
				calculator.add(new AceEightOff());
			else
				calculator.remove(new AceEightOff());
		}
	}
	
	class aceNineOffCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceNineOff.isSelected())
				calculator.add(new AceNineOff());
			else
				calculator.remove(new AceNineOff());
		}
	}

	class aceTenOffCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceTenOff.isSelected())
				calculator.add(new AceTenOff());
			else
				calculator.remove(new AceTenOff());
		}
	}
	
	class aceJackOffCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceJackOff.isSelected())
				calculator.add(new AceJackOff());
			else
				calculator.remove(new AceJackOff());
		}
	}
	
	class aceQueenOffCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceQueenOff.isSelected())
				calculator.add(new AceQueenOff());
			else
				calculator.remove(new AceQueenOff());
		}
	}
	
	class aceKingOffCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(aceKingOff.isSelected())
				calculator.add(new AceKingOff());
			else
				calculator.remove(new AceKingOff());
		}
	}
	
	class jackKingOffCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(jackKingOff.isSelected())
				calculator.add(new JackKingOff());
			else
				calculator.remove(new JackKingOff());
		}
	}
	
	class jackKingSuitedCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(jackKingSuited.isSelected())
				calculator.add(new JackKingSuited());
			else
				calculator.remove(new JackKingSuited());
		}
	}
	
	class tenKingOffCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(tenKingOff.isSelected())
				calculator.add(new TenKingOff());
			else
				calculator.remove(new TenKingOff());
		}
	}
	
	class tenKingSuitedCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(tenKingSuited.isSelected())
				calculator.add(new TenKingSuited());
			else
				calculator.remove(new TenKingSuited());
		}
	}
	
	class tenQueenOffCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(tenQueenOff.isSelected())
				calculator.add(new TenQueenOff());
			else
				calculator.remove(new TenQueenOff());
		}
	}
	
	class tenQueenSuitedCheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(tenQueenSuited.isSelected())
				calculator.add(new TenQueenSuited());
			else
				calculator.remove(new TenQueenSuited());
		}
	}
}



