import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.BorderLayout;

public class BallControl extends JPanel{
	private Ball ball = new Ball();
	private JButton jbtSuspend = new JButton("��ͣ");
	private JButton jbtResume = new JButton("��ʼ");
	private JScrollBar jsbDelay = new JScrollBar();
	
	public BallControl(){
		JPanel panel = new JPanel();
		panel.add(jbtSuspend);
		panel.add(jbtResume);
		ball.setBorder(new LineBorder(Color.red));
		ball.setDelay(jsbDelay.getMaximum());//��������ӳ٣�ʹ�����ڿ�ʼ��ʱ���˶�����
		jsbDelay.setOrientation(JScrollBar.HORIZONTAL);
		setLayout(new BorderLayout());
		add(jsbDelay,BorderLayout.NORTH);
		add(ball,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		jbtSuspend.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ball.suspend();	
			}	
		});
		jbtResume.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ball.resume();	
			}	
		});
		jsbDelay.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent e){
				ball.setDelay(jsbDelay.getMaximum()-e.getValue());//���ֵ-��ǰֵ
			}	
		});
	}
}