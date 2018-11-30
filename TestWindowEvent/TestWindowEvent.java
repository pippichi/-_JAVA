import javax.swing.*;
import java.awt.event.*;

public class TestWindowEvent extends JFrame{
	public static void main(String[] args){
		TestWindowEvent frame=new TestWindowEvent();
		frame.setTitle("TestWindowEvent");
		frame.setSize(220,80);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		}
		
	public TestWindowEvent(){
		addWindowListener(new WindowListener(){
			public void windowDeiconified(WindowEvent event){
				System.out.println("Window deiconified");
				}
			public void windowIconified(WindowEvent event){
				System.out.println("Window iconified");
				}
			public void windowActivated(WindowEvent event){
				System.out.println("Window activated");
				}
			public void windowDeactivated(WindowEvent event){
				System.out.println("Window deactivated");
				}
			public void windowOpened(WindowEvent event){
				System.out.println("Window opened");
				}
			public void windowClosing(WindowEvent event){
				System.out.println("Window closing");
				}
			public void windowClosed(WindowEvent event){
				System.out.println("Window closed");
				}
			});
		}
	}