public class FemaleStars{
 String name;
 int age;
 String profession;
 String masterWork;
 
public FemaleStars(){
 
 }
 public FemaleStars(String Name,int Age,String Profession,String HerMasterWork){
  name=Name;
  age=Age;
  profession=Profession;
  masterWork=HerMasterWork;
 }
 public void sayHello(){
  System.out.println("Hi,��Һã����� "+name+
  "\n ��"+age+" ��"+
  "\n ����һ��"+profession+
  "\n �ҵĴ������ǣ� "+masterWork);
 }
}