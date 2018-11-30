public class Test{
  public static void main(String[] args){
    Wolf w1=new Wolf();
    w1.makeNoise();
    Animal w2=new Wolf();
    w2.makeNoise();
    w2.keepingDiscipline();
    System.out.println(w1.toString());
      }
}