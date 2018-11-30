import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.Timer;

public class AnimationDemo extends JFrame{
	public AnimationDemo(){
		add(new MovingMessagePanel("Welcome to Java."));	
	}
	
	public static void main(String[] args){
			AnimationDemo frame = new AnimationDemo();
			frame.setTitle("AnimationDemo");
			frame.setSize(300,100);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
	}
	
	static class MovingMessagePanel extends JPanel{
		private int xCoordinate = 0;
		private int yCoordinate = 10;
		private String message = "Welcome to Java.";
		
		public MovingMessagePanel(String s){
				message = s;
				
				Timer timer = new Timer(1000,new TimerListener());
				timer.start();
		}
		class TimerListener implements ActionListener{
				public void actionPerformed(ActionEvent e){
					repaint();	
				}
		}
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			if(getWidth()<xCoordinate){
				xCoordinate=-20;	
			}
			xCoordinate+=5;
			g.drawString(message,xCoordinate,yCoordinate);
		}
			
	}	
}