import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControlCircle extends JFrame{
	private JButton jbtEnlarge=new JButton("����");
	private JButton jbtShrink=new JButton("��С");
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
	class EnlargeListener implements ActionListener{//������
	//ʵ���˼����ӿڣ���Ҫ���ǽӿ��еķ���
	  public void actionPerformed(ActionEvent e){
		
		//������ϵ�Բ�뾶����
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
	  frame.setTitle("Բ");
	  frame.setLocationRelativeTo(null);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setVisible(true);
		}
	}

class CirclePanel extends JPanel{//����һ�������࣬�����ϻ�Բ
	private int radius=25;
	public void enLarge(){
		radius+=8;
		repaint();
		}
	public void shrink(){
		radius-=8;
		repaint();
		}
	//JPanel �������ϻ�ͼ�ķ���
	protected void paintComponent(Graphics g){
		super.paintComponent(g);//ˢ��һ�±�հ׽���
		g.setColor(Color.BLUE);
		g.drawOval(getWidth()/2-radius,getHeight()/2-radius,2*radius,2*radius);
		
		}
	}