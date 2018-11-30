import java.util.Scanner;
public class ComputeAreaWithConsoleInput{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数吧：");
		double radius=input.nextDouble();
		double area=radius*radius*3.14159;
		System.out.println("半径为"+radius+"的圆，面积为："+area);
		}
}