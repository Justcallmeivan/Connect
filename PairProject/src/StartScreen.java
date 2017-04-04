import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class StartScreen
{
	private JPanel panel;
	private JFrame rules_frame; 
	private JLabel rules1;
	private JLabel rules2;
	private JLabel rules3;
	private JLabel welcome;
	private JLabel bestPlayer;
	private JButton connect4; 
	private JButton connect5; 
	private JButton connect6; 
	StartScreen()
	{
		rules_frame=new JFrame("Rules");
		connect4=new JButton("Connect-4");
		connect5=new JButton("Connect-5");
		connect6=new JButton("Connect-6");
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
		connect4.setFont(f1);
		connect4.setBackground(Color.white);
		connect5.setFont(f1);
		connect5.setBackground(Color.white);
		connect6.setFont(f1);
		connect6.setBackground(Color.white);
		welcome.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		bestPlayer.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		rules1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		rules2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		rules3.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		connect4.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		connect5.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		connect6.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
		panel=new JPanel();
		panel.setForeground(Color.yellow);
		panel.setBackground(Color.yellow);
		panel.setBorder(BorderFactory.createEmptyBorder(10, 55, 10, 55));
		rules_frame.setContentPane(panel);
		c.gridx=0;
		c.gridy=0;
		rules_frame.add(welcome,c);
		c.gridy=1;
		rules_frame.add(rules1);
		c.gridy=2;
		rules_frame.add(rules2);
		c.gridy=3;
		rules_frame.add(rules3);
		c.gridy=4;
		rules_frame.add(bestPlayer);
		c.gridx=0;
		c.gridy=5;
		rules_frame.add(connect4);
		c.gridx=1;
		c.gridy=5;
		rules_frame.add(connect5);
		c.gridx=2;
		c.gridy=5;
		rules_frame.add(connect6);
		rules_frame.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		rules_frame.pack();
		rules_frame.setLocationRelativeTo(null);
		rules_frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		StartScreen x=new StartScreen();
	}
}