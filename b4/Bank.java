import java.util.Scanner;
public class Bank{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������������:");
		double r=input.nextDouble();
		System.out.println("����������");
		double m=input.nextDouble();
		System.out.println("������Ҫ�����꣺");
		double y=input.nextDouble();
		double monthsum=(int)(m*(r/1200)/(1-1/Math.pow(1+(r/1200),y*12)));
		double sum=monthsum*y*12;
		System.out.println("�³�����Ϊ��"+monthsum+";�ܳ�����Ϊ��"+sum);
		
		}
	}