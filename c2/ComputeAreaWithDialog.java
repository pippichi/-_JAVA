import javax.swing.JOptionPane;
public class ComputeAreaWithDialog{
	public static void main(String[] args){
			String str1 = JOptionPane.showInputDialog(null,"请输入：");
			int str = Integer.parseInt(str1);
			if(str>1){
				JOptionPane.showMessageDialog(null,"你赢了！","对话框",JOptionPane.INFORMATION_MESSAGE);	
			}else{
				JOptionPane.showMessageDialog(null,"Lose","conversation",JOptionPane.INFORMATION_MESSAGE);	
			}
	}
}