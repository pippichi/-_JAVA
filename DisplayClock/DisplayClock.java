import java.awt.*;
import javax.swing.*;

public class DisplayClock extends JFrame{
	public DisplayClock(){
		StillClock clock=new StillClock();
		MessagePanel messagePanel1=new MessagePanel(clock.getHour()+" : "+
		clock.getMinute()+" : "+clock.getSecond());
		messagePanel1.setFont(new Font("Courier",Font.BOLD,16));
		messagePanel1.setCentered(true);
		messagePanel1.setForeground(Color.BLUE);
		add(clock);
		add(messagePanel1,BorderLayout.SOUTH);
		}
		
		public static void main(String[] args){
			DisplayClock frame=new DisplayClock();
			frame.setLocationRelativeTo(null);
			frame.setSize(300,350);
			frame.setTitle("DisplayClock");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			}
	}
