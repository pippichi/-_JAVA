public class TestCircle{
	public static void main(String[] args)throws Exception{
		Circle c1=new Circle(2);
		Circle c2=(Circle)c1.clone();
		Circle c3=c1;					
		try{
			c1.clone();
			}
		catch(Exception e){
			throw new Exception("clone() wrong!");
			}
		c2.setRadius(5);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c3.equals(c2));
		}
	}