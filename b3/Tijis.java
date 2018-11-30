import javax.swing.JOptionPane;
public class Tijis{
	public static void main(String[] args){
    String str1=JOptionPane.showInputDialog(null,"请输入圆柱的半径：");
    double r=Double.parseDouble(str1);
    String str2=JOptionPane.showInputDialog(null,"请输入圆柱的高：");
    double h=Double.parseDouble(str2);
    double Tijis=(int)(r*r*3.14159*100)/100.0;
    JOptionPane.showMessageDialog(null,"半径为"+r+"的高为"+h+"的圆柱的体积为:"+Tijis,"圆柱的体积",JOptionPane.INFORMATION_MESSAGE);
		}
	}