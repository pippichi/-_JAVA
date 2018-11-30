public calss DiceGame{
public static void main(String[] args){
System.out.println("抛色子游戏开始了！");
int points=castDice();
if(points==2||points==3||points==12){
System.out.println("You lose!")
}
else if(points==7||points==9){
System.out.println("You win!");
}
else{
System.out.println("确定了一个点"+points);
castDice(points);
}
}
//扔色子
public static int castDice(){
//扔两次色子的和
int dice1=(int)(Math.random()*6+1);
int dice2=(int)(Math.random()*6+1);
int points=dice1+dice2;
System.out.println("你抛出了"+dice1+" + "+dice2+" = "+points);
return points;
}
//定义一个定点之后不断抛色子直到出现输赢的情况
public static void castDice(int p){
//定点之后抛出的点数
int points=0;
//循环抛直到出现输赢为止
while(points!=p && points!=7){
points=castDice();
if(points==p){
System.out.println("You win!");
}
if(points==7){
System.out.println("You lose!");
}
}
}
}