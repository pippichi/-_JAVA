import java.util.Scanner;
public class Tiji{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������Բ���İ뾶��");
		double r=input.nextDouble();
		System.out.println("������Բ���ĸߣ�");
		double h=input.nextFloat();
		double Tiji=(int)(r*r*3.14159*h*100)/100.0;
		System.out.println("�뾶Ϊ"+r+"�ĸ�Ϊ"+h+"��Բ�������Ϊ:"+Tiji);
		
		}
	}