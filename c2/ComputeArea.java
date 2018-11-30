public class ComputeArea{
	public static void main(String[] args){
		double radius=12.2;
		double area=radius*radius*3.14159;
		double area1=(int)(area*100)/100.0;
		System.out.println("半径为"+radius+"的圆，面积为："+area1);
	}
}

