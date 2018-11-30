import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class TestPaintComponent extends JFrame{
	public TestPaintComponent(){
		MyPanel myPanel=new MyPanel();
		add(myPanel);
		}
	
	public static void main(String[] args){
		TestPaintComponent frame=new TestPaintComponent();
		frame.setSize(2600,2200);
		frame.setTitle("Paint");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
	}
	
class MyPanel extends JPanel{
	public void paintComponent(Graphics g){
		g.setColor(Color.blue);
		g.drawLine(40,40,200,200);
		g.setFont(new Font("宋体",Font.BOLD,40));
		g.drawString("做优秀的投资者不需要很高的智商，只需要不轻易从中的思想",150,150);
		g.setColor(Color.red);
		g.drawRoundRect(50,50,400,200,30,60);
		g.fillRoundRect(460,260,400,200,30,60);
		g.setColor(Color.green);
		
		g.fill3DRect(500,500,400,200,true);
		g.fill3DRect(980,500,400,200,false);
		
		g.setColor(Color.black);
		g.fillArc(500,900,400,400,0,30);
		g.fillArc(500,900,400,400,90,30);
		g.fillArc(500,900,400,400,180,30);
		g.fillArc(500,900,400,400,270,30);
		
		}
	}