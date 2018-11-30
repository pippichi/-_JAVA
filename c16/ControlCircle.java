import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControlCircle extends JFrame{
	private JButton jbtEnlarge=new JButton("扩大");
	private JButton jbtShrink=new JButton("缩小");
	private CirclePanel canvas=new CirclePanel();
	public ControlCircle(){
		JPanel panel1=new JPanel();
		panel1.add(jbtShrink);
		panel1.add(jbtEnlarge);
		add(canvas,BorderLayout.CENTER);
		add(panel1,BorderLayout.SOUTH);
		EnlargeListener listener=new EnlargeListener();
		ShrinkListener listener1=new ShrinkListener();
		jbtEnlarge.addActionListener(listener);
		jbtShrink.addActionListener(listener1);
		}
	class EnlargeListener implements ActionListener{//监听类
	//实现了监听接口，需要覆盖接口中的方法
	  public void actionPerformed(ActionEvent e){
		
		//把面板上的圆半径扩大
		  canvas.enLarge();
		}
	}
	class ShrinkListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			canvas.shrink();
			}
		}

	public static void main(String[] args){
	  ControlCircle frame=new ControlCircle();
	  frame.setSize(300,250);
	  frame.setTitle("圆");
	  frame.setLocationRelativeTo(null);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setVisible(true);
		}
	}

class CirclePanel extends JPanel{//建立一个面板的类，该类上画圆
	private int radius=25;
	public void enLarge(){
		radius+=8;
		repaint();
		}
	public void shrink(){
		radius-=8;
		repaint();
		}
	//JPanel 往自身上画图的方法
	protected void paintComponent(Graphics g){
		super.paintComponent(g);//刷新一下变空白界面
		g.setColor(Color.BLUE);
		g.drawOval(getWidth()/2-radius,getHeight()/2-radius,2*radius,2*radius);
		
		}
	}