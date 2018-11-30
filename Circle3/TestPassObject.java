import java.text.DecimalFormat;
public class TestPassObject{
 public static void main(String[] args){
  Circle3 myCircle=new Circle3(1);
  int n=5;
  printAreas(myCircle,5);
  System.out.println("\nRadius is: "+myCircle.getRadius());
  System.out.println("n is: "+n);
  }
 public static void printAreas(Circle3 c,int times){
  DecimalFormat df=new DecimalFormat("#.000");
  System.out.println("Radius\t\tAreas\t\tCircles");
  while(times>=1){
    System.out.println(c.getRadius()+"\t\t"+df.format(c.getArea())+"\t\t"+df.format(c.getCircle()));
    c.setRadius(c.getRadius()+1);
    times--;
 }
 }
}