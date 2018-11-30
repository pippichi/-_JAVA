import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;

public class BallAnimationDemo extends JFrame{
	static class Ball extends JPanel{
			private int radius = 20;
			
			public Ball(int radius){
				this.radius=radius;	
			};	
			public int getRadius(){return radius;}				
	}
	static class KeyboardPanel extends JPanel{
		  Ball ball = new Ball(20);
			private int y = 100;
			private int x = 100;
			public KeyboardPanel(){
				addKeyListener(new KeyAdapter(){
					public void keyPressed(KeyEvent e){
						switch(e.getKeyCode()){
							case KeyEvent.VK_UP:y-=10;break;
							case KeyEvent.VK_DOWN:y+=10;break;
							case KeyEvent.VK_RIGHT:x+=10;break;
							case KeyEvent.VK_LEFT:x-=10;break;	
						}
						repaint();	
					}	
				});	
			}
			protected void paintComponent(Graphics g){
				super.paintComponent(g);
				g.setColor(Color.red);
				g.fillOval(x-ball.getRadius(),y-ball.getRadius(),ball.getRadius()*2,ball.getRadius()*2);
			}
	}
	
	public BallAnimationDemo(){
		KeyboardPanel keyboardpanel = new KeyboardPanel();
		add(keyboardpanel);
		keyboardpanel.setFocusable(true);	
	}	
	public static void main(String[] args){
		BallAnimationDemo frame = new BallAnimationDemo();
		frame.setTitle("BallAnimationDemo");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}
}
