public class JavaGupiao{
 public static void main(String[] args){
  Stock Java=new Stock(4.5,4.35);
  System.out.println("市值变化百分比为： "+100*Java.getChangePercent()+"%");
 }
}