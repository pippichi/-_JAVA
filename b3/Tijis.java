import javax.swing.JOptionPane;
public class Tijis{
	public static void main(String[] args){
    String str1=JOptionPane.showInputDialog(null,"������Բ���İ뾶��");
    double r=Double.parseDouble(str1);
    String str2=JOptionPane.showInputDialog(null,"������Բ���ĸߣ�");
    double h=Double.parseDouble(str2);
    double Tijis=(int)(r*r*3.14159*100)/100.0;
    JOptionPane.showMessageDialog(null,"�뾶Ϊ"+r+"�ĸ�Ϊ"+h+"��Բ�������Ϊ:"+Tijis,"Բ�������",JOptionPane.INFORMATION_MESSAGE);
		}
	}