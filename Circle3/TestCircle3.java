import java.text.DecimalFormat;
public class TestCircle3{
	public static void main(String[] args){
		DecimalFormat df=new DecimalFormat("#.00");
		Circle3 myCircle=new Circle3(5.0);
		System.out.println("The area of myCircle of radius "+myCircle.getRadius()+" is "+df.format(myCircle.getArea()));
		
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of myCircle of radius "+myCircle.getRadius()+" is "+df.format(myCircle.getArea()));
		System.out.println("The number of objects created is "+Circle3.getNumberOfObjects());
		}
	}