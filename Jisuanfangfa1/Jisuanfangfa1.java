import java.util.Scanner;
public class Jisuanfangfa1{
public static double m(int i){
double k,sum=0,q;
int flag=1;
for(int x=1;x<i*2;x+=2){
 q=(double)(Math.pow(x,(-1)));
 k=q*flag;
 flag=-flag;
 sum+=4*k;
}
return sum;
}
public static void main(String[] args){
System.out.println("i"+"       "+"m(i)");
int m;
for(int n=1;n<=10;n++){
m=10*n;
double a=m(m);
if(m<100){
System.out.println(m+"      "+a);}
if(m>=100){
System.out.println(m+"     "+a);}
}
}
}