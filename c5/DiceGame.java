public calss DiceGame{
public static void main(String[] args){
System.out.println("��ɫ����Ϸ��ʼ�ˣ�");
int points=castDice();
if(points==2||points==3||points==12){
System.out.println("You lose!")
}
else if(points==7||points==9){
System.out.println("You win!");
}
else{
System.out.println("ȷ����һ����"+points);
castDice(points);
}
}
//��ɫ��
public static int castDice(){
//������ɫ�ӵĺ�
int dice1=(int)(Math.random()*6+1);
int dice2=(int)(Math.random()*6+1);
int points=dice1+dice2;
System.out.println("���׳���"+dice1+" + "+dice2+" = "+points);
return points;
}
//����һ������֮�󲻶���ɫ��ֱ��������Ӯ�����
public static void castDice(int p){
//����֮���׳��ĵ���
int points=0;
//ѭ����ֱ��������ӮΪֹ
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