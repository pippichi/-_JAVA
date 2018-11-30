import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Font;

public class KeyEventDemo extends JFrame{
	private KeyboardPanel keyboardpanel = new KeyboardPanel();
	public KeyEventDemo(){
		add(keyboardpanel);
		keyboardpanel.setFocusable(true);
	}
	
	public static void main(String[] args){
		KeyEventDemo frame = new KeyEventDemo();
		frame.setTitle("KeyEventDemo");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}
	
	static class KeyboardPanel extends JPanel{
		private int x = 100;
		private int y = 100;
		private char keyChar = 'A';//default keyChar	
		public KeyboardPanel(){
			addKeyListener(new KeyAdapter(){
				public void keyPressed(KeyEvent e){
					switch(e.getKeyCode()){
						case KeyEvent.VK_DOWN:y+=10;break;
						case KeyEvent.VK_UP:y-=10;break;
						case KeyEvent.VK_RIGHT:x+=10;break;
						case KeyEvent.VK_LEFT:x-=10;break;
						default:keyChar = e.getKeyChar();	
					}
					repaint();	
				}	
			});	
		}

	
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setFont(new Font("TimesRoman",Font.PLAIN,24));
			g.drawString(String.valueOf(keyChar),x,y);	
		}
	}	
}