public class Dog extends Canine implements Pet{
  public void makeNoise(){
    System.out.println("狗都 汪汪叫");
    
  }
  public void eat(){
    System.out.println("狗都爱吃骨头");
  }
  
  public void beFriendly(){
    System.out.println("狗扑向你");
  }
  public void play(){
    System.out.println("扔个飞盘，在空中接住");
  }
  public void sleep(){
    System.out.println("狗团成一团睡，稍微警觉一点");
  }
}