import javax.swing.JFrame;
import javax.swing.JButton;
public class MyFrame{
	public static void main(String[] args){
		 JFrame frame=new JFrame();
		 JButton jbtOK=new JButton("第一个按钮OK");
     //创建一个按钮
		 frame.add(jbtOK);
		 //把按钮加到窗体上
		 frame.setTitle("学习第一个窗体");
		 frame.setSize(800,600);
		 frame.setLocationRelativeTo(null);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		}
	 
	}