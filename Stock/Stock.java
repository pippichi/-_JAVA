import java.text.DecimalFormat;
class Stock{
 String Symbol;
 String name;
 double previousClosingPrice;
 double currentPrice;
 Stock(){
 
 }
 Stock(double newpreviousClosingPrice,double newcurrentPrice){
 previousClosingPrice=newpreviousClosingPrice;
 currentPrice=newcurrentPrice;
 }
 double getChangePercent(){
 double result=currentPrice*Math.pow(previousClosingPrice,-1);
 DecimalFormat Baoliu=new DecimalFormat("#.0000");
 double baoliu=Double.parseDouble(Baoliu.format(result));
 return baoliu;
 }
}