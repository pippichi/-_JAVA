public abstract class Animal{
  String picture;
  String food;
  
  
  public Animal(){
  System.out.println("创建了一个动物");
  }
  
  public abstract void makeNoise();
    //System.out.println("动物都能叫");
 
  
  public abstract void eat();
    //System.out.println("动物都能进食");
  
  
  public abstract void sleep();
    //System.out.println("动物都要睡觉");
  
  
  public abstract void roam();
    //System.out.println("动物都能移动");
  
  
  public abstract void keepingDiscipline();
    //System.out.println("狼都保持强的纪律性");
  
 
}