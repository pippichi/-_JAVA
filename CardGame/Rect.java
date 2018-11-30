import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.Color;

public class Rect extends JPanel{
	private int yCoordinate = 15;
	private int xCoordinate = 100;
	private Timer timer = new Timer(150,new TimerListener());
	private int dx = 20;
	
	public Rect(){
		timer.stop();	
	}
	private class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			repaint();	
		}
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.green);
		xCoordinate-=dx;
		g.fill3DRect(xCoordinate,yCoordinate,40,65,true);	
	}
	public void start(){
		timer.start();	
	}
}