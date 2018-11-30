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
  System.out.println("Hi,大家好，我是 "+name+
  "\n 我"+age+" 岁"+
  "\n 我是一名"+profession+
  "\n 我的代表作是： "+masterWork);
 }
}