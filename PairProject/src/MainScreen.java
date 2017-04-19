import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class MainScreen
{
	private JFrame frame; 
	Draw y=new Draw();
	MainScreen()
	{
		frame=new JFrame("Connect");
		Font f1=new Font("Arial",Font.BOLD, 30);
		frame.setContentPane(y);
		y.setForeground(new Color(160,205,230));
		y.setBackground(new Color(160,205,230));
		y.setValues(new int[9][7]);	
		frame.pack();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		MainScreen x=new MainScreen();
	}
	class Draw extends JPanel
	{
		private int values[][];
		public void setValues(int a[][])
		{
			values=a;
		}
		public int[][] getValues()
		{
			return values;
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(new Color(12,95,155));
			int rows=getValues().length;
			int cols=getValues()[0].length;
			System.out.println(rows+"    "+cols);
			g.setFont(new Font("Arial",Font.BOLD, 30));
			g.drawString("Connect",725, 50);
			g.drawRect((1850-rows*100)/2 -1, 99, rows*70+1, cols*70+1);
			g.setColor(Color.yellow);
			g.fillRect((1850-rows*100)/2, 100, rows*70, cols*70);
			for(int i=((1850-rows*100)/2)+25;i<=rows*70;i+=70)
			{
				for(int j=125;j<=cols*70;j+=70)
				{ 
					g.setColor(new Color(12,95,155));
					g.drawOval(i-2, j-2, 53, 53);
					g.setColor(Color.white);
					g.fillOval(i, j, 50, 50);
				}
			}
		}
	}
}