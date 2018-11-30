import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ClockAnimation extends JFrame{
	private StillClock clock=new StillClock();
	
	public ClockAnimation(){
		add(clock);
		Timer timer=new Timer(1000,new TimerListener());
		timer.start();
		}
		private class TimerListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				clock.setCurrentTime();
				clock.repaint();
				}
			}
		
		public static void main(String[] args){
			JFrame frame=new ClockAnimation();
			frame.setSize(300,250);
			frame.setTitle(" ±÷”");
	    frame.setLocationRelativeTo(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
			}
	}