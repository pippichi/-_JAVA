import java.awt.event.*;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.Timer;
public class Message extends JPanel{
	private int xCoordinate = 10;
	private int yCoordinate = 115;
	private String message;
	public Message(){}
	public Message(String s){
			message = s;				
			Timer timer = new Timer(1000,new TimerListener());
			timer.start();
	}
	public void setMessage(String s){
		message = s;	
	}
	public String getMessage(){
		return message;	
	}
	class TimerListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				repaint();	
			}
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		if(getWidth()<xCoordinate){
			xCoordinate = -30;	
		}
		xCoordinate +=10;
		g.drawString(message,xCoordinate,yCoordinate);				
	}			
}