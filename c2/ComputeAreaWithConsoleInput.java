import java.util.Scanner;
public class ComputeAreaWithConsoleInput{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ�������ɣ�");
		double radius=input.nextDouble();
		double area=radius*radius*3.14159;
		System.out.println("�뾶Ϊ"+radius+"��Բ�����Ϊ��"+area);
		}
}