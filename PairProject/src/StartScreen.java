import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class StartScreen implements ActionListener 
{
	private JPanel panel;
	private JFrame rules_frame; 
	private JLabel rules1;
	private JLabel rules2;
	private JLabel rules3;
	private JLabel welcome;
	private JLabel bestPlayer;
	private JButton connect3; 
	private JButton connect4; 
	private JButton connect5; 
	StartScreen()
	{
		rules_frame=new JFrame("Rules");
		connect3=new JButton("Connect-3");
		connect3.addActionListener(this);
		connect3.setActionCommand("connect-3");
		connect4=new JButton("Connect-4");
		connect4.addActionListener(this);
		connect4.setActionCommand("connect-4");
		connect5=new JButton("Connect-5");
		connect5.addActionListener(this);
		connect5.setActionCommand("connect-5");
		welcome=new JLabel("WELCOME TO CONNECT!");
		rules1=new JLabel("To win: Connect respective number of pieces in a row, column or diagonally ");
		rules2=new JLabel("You will be playing against the computer.");
		rules3=new JLabel("You will be Player 1");
		bestPlayer=new JLabel("May the best player win!");
		Font f1=new Font("Arial",Font.PLAIN, 20);
		Font f2=new Font("Arial",Font.BOLD, 30);
		welcome.setForeground(Color.BLUE);
		GridBagConstraints c = new GridBagConstraints();
		welcome.setFont(f2);
		bestPlayer.setForeground(Color.BLUE);
		bestPlayer.setFont(f2);
		rules1.setFont(f1);
		rules2.setFont(f1);
		rules3.setFont(f1);
		connect3.setFont(f1);
		connect3.setBackground(Color.white);
		connect4.setFont(f1);
		connect4.setBackground(Color.white);
		connect5.setFont(f1);
		connect5.setBackground(Color.white);
		welcome.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		bestPlayer.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		rules1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		rules2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		rules3.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		connect3.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		connect4.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		connect5.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		panel=new JPanel();
		panel.setForeground(Color.yellow);
		panel.setBackground(Color.yellow);
		panel.setBorder(BorderFactory.createEmptyBorder(10, 55, 10, 55));
		rules_frame.setContentPane(panel);
		rules_frame.add(welcome,c);
		rules_frame.add(rules1);
		rules_frame.add(rules2);
		rules_frame.add(rules3);
		rules_frame.add(bestPlayer);
		rules_frame.add(connect3);
		rules_frame.add(connect4);
		rules_frame.add(connect5);
		rules_frame.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		rules_frame.pack();
		rules_frame.setLocationRelativeTo(null);
		rules_frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		StartScreen x=new StartScreen();
	}
	public void actionPerformed(ActionEvent evt) {
		rules_frame.setVisible(false);
		if(evt.getActionCommand() == "connect-3")
		{
			MainScreen x=new MainScreen(new int[6][5]);	
		}
		if(evt.getActionCommand() == "connect-4")
		{
			MainScreen x=new MainScreen(new int[7][6]);	
		}
		if(evt.getActionCommand() == "connect-5")
		{
			MainScreen x=new MainScreen(new int[8][7]);	
		}
	}
}