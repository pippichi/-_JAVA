import javax.swing.JOptionPane;
public class Grades{
	public static void main(String[] args){
		String GradeStr=JOptionPane.showInputDialog("������һ���ɼ���");
		int Grade = Integer.parseInt(GradeStr);
		if(Grade<=100 && Grade>=90){
			JOptionPane.showMessageDialog(null,"�ɼ��÷�Ϊ��A","�ɼ���λ",JOptionPane.INFORMATION_MESSAGE);
			}
		else if(Grade<90 && Grade>=80){
		  JOptionPane.showMessageDialog(null,"�ɼ��÷�Ϊ��B","�ɼ���λ",JOptionPane.INFORMATION_MESSAGE);
		  }
		else if(Grade<80 && Grade>=70){
			JOptionPane.showMessageDialog(null,"�ɼ��÷�Ϊ��C","�ɼ���λ",JOptionPane.INFORMATION_MESSAGE);
			}
		else if(Grade<70 && Grade>=60){
			JOptionPane.showMessageDialog(null,"�ɼ��÷�Ϊ��D","�ɼ���λ",JOptionPane.INFORMATION_MESSAGE);
			}
		else{
			JOptionPane.showMessageDialog(null,"�ɼ��÷�Ϊ��E","�ɼ���λ",JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}