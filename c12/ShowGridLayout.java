import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
public class ShowGridLayout extends JFrame{
	public ShowGridLayout(String title){
		super(title);
		setLayout(new GridLayout(3,4,9,5));
		JButton[] buttons=new JButton[10];
		for(int i=0;i<buttons.length;i++){
			buttons[i]=new JButton("按钮"+(i+1));
			add(buttons[i]);
			}
		}
		public static void main(String[] args){
		 ShowGridLayout frame=new ShowGridLayout("第一个窗口");
		 //frame.add(jbtOK);
		 //把按钮加到窗体上
		 //frame.setTitle("学习第一个窗体");
		 frame.setSize(800,600);
		 frame.setLocationRelativeTo(null);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		}
	}