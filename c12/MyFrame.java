import javax.swing.JFrame;
import javax.swing.JButton;
public class MyFrame{
	public static void main(String[] args){
		 JFrame frame=new JFrame();
		 JButton jbtOK=new JButton("��һ����ťOK");
     //����һ����ť
		 frame.add(jbtOK);
		 //�Ѱ�ť�ӵ�������
		 frame.setTitle("ѧϰ��һ������");
		 frame.setSize(800,600);
		 frame.setLocationRelativeTo(null);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		}
	 
	}