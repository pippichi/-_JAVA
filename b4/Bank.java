import java.util.Scanner;
public class Bank{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入年利率:");
		double r=input.nextDouble();
		System.out.println("请输入贷款金额：");
		double m=input.nextDouble();
		System.out.println("请问您要贷几年：");
		double y=input.nextDouble();
		double monthsum=(int)(m*(r/1200)/(1-1/Math.pow(1+(r/1200),y*12)));
		double sum=monthsum*y*12;
		System.out.println("月偿还额为："+monthsum+";总偿还额为："+sum);
		
		}
	}