public class TestCircle2{
 public static void main(String[] args){
  System.out.println("Before creating objects");
  System.out.println("The number of objects is "+Circle2.getNumberOfObjects());
  System.out.println();
  Circle2 c1=new Circle2();
  System.out.println("After creating c1");
  System.out.println("ci's radius: "+c1.radius+" and the number of objects is: "+Circle2.getNumberOfObjects());
  Circle2 c2=new Circle2(5);
  c1.radius = 9;
  System.out.println("After creating c2 and modifying c1");
  System.out.println("c1's radius: "+c1.radius+"\nc2's radius: "+c2.radius+"\nThe number of objects is: "+Circle2.getNumberOfObjects());
 }
}