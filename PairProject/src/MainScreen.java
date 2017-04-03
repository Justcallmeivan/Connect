import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class MainScreen
{
	private JPanel panel;
	private JFrame frame; 
	private JLabel rules1;
	private JLabel rules2;
	private JLabel rules3;
	private JLabel welcome;
	private JLabel bestPlayer;
	private JButton close; 
	MainScreen()
	{
		frame=new JFrame("Connect");
		close=new JButton("Let's Go!");
		welcome=new JLabel("WELCOME TO CONNECT!");
		rules1=new JLabel("To win: Connect respective number of pieces in a row, column or diagonally ");
		rules2=new JLabel("You will be playing against the computer.");
		rules3=new JLabel("You will be Player 1");
		bestPlayer=new JLabel("May the best player win!");
		Font f1=new Font("Arial",Font.PLAIN, 20);
		Font f2=new Font("Arial",Font.BOLD, 30);
		welcome.setForeground(Color.BLUE);
		welcome.setFont(f2);
		bestPlayer.setForeground(Color.BLUE);
		bestPlayer.setFont(f2);
		rules1.setFont(f1);
		rules2.setFont(f1);
		rules3.setFont(f1);
		close.setFont(f1);
		close.setBackground(Color.white);
		welcome.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		bestPlayer.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		rules1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		rules2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		rules3.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		close.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		panel=new JPanel();
		panel.setForeground(Color.yellow);
		panel.setBackground(Color.yellow);
		panel.setBorder(BorderFactory.createEmptyBorder(10, 55, 10, 55));
		rules_frame.setContentPane(panel);
		rules_frame.add(welcome);
		rules_frame.add(rules1);
		rules_frame.add(rules2);
		rules_frame.add(rules3);
		rules_frame.add(bestPlayer);
		rules_frame.add(close);
		rules_frame.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		rules_frame.pack();
		rules_frame.setLocationRelativeTo(null);
		rules_frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		MainScreen x=new MainScreen();
	}
}