import javax.swing.JOptionPane;
public class LeapYearWithDialog{
	public static void main(String[] args){
		//JOptionPane.showMessageDialog("������һ�����");
		String yearStr=JOptionPane.showInputDialog("������һ����ݣ���2018");
		//���������ַ���ת��������
		int year=Integer.parseInt(yearStr);
	  boolean year2=(year%4==0 && year%100!=0)||(year%400==0);
		if(year2){
       JOptionPane.showMessageDialog(null,year+"������");
		}
		else
		   JOptionPane.showMessageDialog(null,year+"��������");
	}
}