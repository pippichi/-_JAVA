public class TestCircle{
 public static void main(String[] args){
  Circle c1=new Circle();
  Circle c2=new Circle(25.8);
  System.out.println("c1 �İ뾶Ϊ "+c1.radius+
  "���������Ϊ "+c1.getArea());
  System.out.println("c2 �İ뾶Ϊ "+c2.radius+
  "���������Ϊ "+c2.getArea());
 }
}