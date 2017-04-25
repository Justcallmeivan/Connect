import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class MainScreen implements MouseListener
{
	private JFrame frame; 
	private Shape[][] circleGrid;
	private Shape[] rectGrid;
	Draw y=new Draw();
	int rows;
	int cols;
	MainScreen(int[][] values)
	{
		frame=new JFrame("Connect");
		Font f1=new Font("Arial",Font.BOLD, 30);
		frame.setContentPane(y);
		y.setForeground(new Color(160,205,230));
		y.setBackground(new Color(160,205,230));
		rows=values.length;
		cols=values[0].length;
		rectGrid=new Shape[cols];
		circleGrid = new Shape[rows][cols];
		int ovalStart1=313;
		int ovalStart2=110;
		int rectStart1=300;
		int rectStart2=100;
		int rectHeight=rows*70;
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<rows;j++)
			{ 
				circleGrid[j][i] = new Ellipse2D.Double(ovalStart1, ovalStart2, 50, 50);
				ovalStart1+=70;
			}
			ovalStart2+=70;
			ovalStart1-=(70*rows);
		}
		for(int a=0;a<cols;a++)
		{
			rectGrid[a]=new Rectangle2D.Double(rectStart1,rectStart2,70,rectHeight);
			rectStart1+=70;
		}
		frame.addMouseListener(this);
		frame.pack();
		frame.setSize(new Dimension(1000,1000)); 
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	class Draw extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(new Color(12,95,155));
			System.out.println(rows+"    "+cols);
			g.setFont(new Font("Arial",Font.BOLD, 30));
			g.drawString("Connect",465, 50);
			g.drawRect(300, 99, rows*70+1, cols*70+1);
			g.setColor(Color.yellow);
			g.fillRect(300, 100, rows*70, cols*70);
			int ovalStart1=313;
			int ovalStart2=110;
			g.setColor(Color.red);
			g.drawOval(150, 75, 60, 60);
			g.fillOval(150, 75, 60, 60);
			g.setColor(Color.black);
			g.drawOval(850, 75, 60, 60);
			g.fillOval(850, 75, 60, 60);
			for(int i=0;i<cols;i++)
			{
				for(int j=0;j<rows;j++)
				{ 
					g.setColor(new Color(12,95,155));
					((Graphics2D) g).draw(new Ellipse2D.Double(ovalStart1-1, ovalStart2-1, 52, 52));
					g.setColor(Color.white);
					((Graphics2D) g).fill(circleGrid[j][i]);
					ovalStart1+=70;
				}
				ovalStart2+=70;
				ovalStart1-=(70*rows);
			}
		}
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mousePressed(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {}

}