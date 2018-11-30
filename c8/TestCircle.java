public class TestCircle{
 public static void main(String[] args){
  Circle c1=new Circle();
  Circle c2=new Circle(25.8);
  System.out.println("c1 的半径为 "+c1.radius+
  "　它的面积为 "+c1.getArea());
  System.out.println("c2 的半径为 "+c2.radius+
  "　它的面积为 "+c2.getArea());
 }
}