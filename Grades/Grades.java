import javax.swing.JOptionPane;
public class Grades{
	public static void main(String[] args){
		String GradeStr=JOptionPane.showInputDialog("请输入一个成绩：");
		int Grade = Integer.parseInt(GradeStr);
		if(Grade<=100 && Grade>=90){
			JOptionPane.showMessageDialog(null,"成绩得分为：A","成绩段位",JOptionPane.INFORMATION_MESSAGE);
			}
		else if(Grade<90 && Grade>=80){
		  JOptionPane.showMessageDialog(null,"成绩得分为：B","成绩段位",JOptionPane.INFORMATION_MESSAGE);
		  }
		else if(Grade<80 && Grade>=70){
			JOptionPane.showMessageDialog(null,"成绩得分为：C","成绩段位",JOptionPane.INFORMATION_MESSAGE);
			}
		else if(Grade<70 && Grade>=60){
			JOptionPane.showMessageDialog(null,"成绩得分为：D","成绩段位",JOptionPane.INFORMATION_MESSAGE);
			}
		else{
			JOptionPane.showMessageDialog(null,"成绩得分为：E","成绩段位",JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}