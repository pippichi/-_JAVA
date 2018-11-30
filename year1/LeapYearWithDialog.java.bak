import javax.swing.JOptionPane;
public class LeapYearWithDialog{
	public static void main(String[] args){
		//JOptionPane.showMessageDialog("请输入一个年份");
		String yearStr=JOptionPane.showInputDialog("请输入一个年份：如2018");
		//将数字型字符串转换成整数
		int year=Integer.parseInt(yearStr);
	  boolean year2=(year%4==0 && year%100!=0)||(year%400==0);
		if(year2){
       JOptionPane.showMessageDialog(null,year+"是闰年");
		}
		else
		   JOptionPane.showMessageDialog(null,year+"不是闰年");
	}
}