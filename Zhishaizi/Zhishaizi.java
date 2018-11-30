public class Zhishaizi{
public static void main(String[] args){
int i=Sum();
if(i==2||i==3||i==12){
System.out.println("You lose");
}
else if(i==7||i==11){
System.out.println("You win!");
}
else{
int h=Sum(),d=0;
while(d==0){
if(h==i){
System.out.println("You win!");
break;
}
else if(h==7){
System.out.println("You lose");
break;
}
else{
System.out.println("不好意思，请重新尝试。");
break;
}
}
}
}
public static int Sum(){
int num1=(int)(Math.random()*6+1),num2=(int)(Math.random()*6+1);
int sum=num1+num2;
System.out.println("You rolled "+num1+" + "+num2+" = "+sum);
return sum;
}
}