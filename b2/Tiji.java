import java.util.Scanner;
public class Tiji{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入圆柱的半径：");
		double r=input.nextDouble();
		System.out.println("请输入圆柱的高：");
		double h=input.nextFloat();
		double Tiji=(int)(r*r*3.14159*h*100)/100.0;
		System.out.println("半径为"+r+"的高为"+h+"的圆柱的体积为:"+Tiji);
		
		}
	}