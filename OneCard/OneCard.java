import java.util.Arrays;
import javax.swing.JOptionPane;
public class OneCard{
public static String[] player(String[] p){
int[] deck = new int[52];
String[] suits={"黑桃","红心","方块","梅花"};
String[] ranks={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
for(int i=0;i<deck.length;i++){
deck[i]=i;
}
for(int i=0;i<deck.length;i++){
int index=(int)(Math.random()*deck.length);
int temp=deck[i];
deck[i]=deck[index];
deck[index]=temp;
}
for(int i=0;i<3;i++){
String suit=suits[deck[i]/13];
String rank=ranks[deck[i]%13];
p[i]=(suit+rank);
}
return p;
}
public static void main(String[] args){
String[] player1=new String[3];
String[] player2=new String[3];
JOptionPane.showMessageDialog(null,Arrays.toString(player(player1)),"Player1",JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null,Arrays.toString(player(player2)),"Player2",JOptionPane.INFORMATION_MESSAGE);
int j=JOptionPane.showConfirmDialog(null,"是否继续","提示框",JOptionPane.YES_NO_OPTION);
while(j==0){
player1=new String[3];
player2=new String[3];
JOptionPane.showMessageDialog(null,Arrays.toString(player(player1)),"Player1",JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null,Arrays.toString(player(player2)),"Player2",JOptionPane.INFORMATION_MESSAGE);
j=JOptionPane.showConfirmDialog(null,"是否继续","提示框",JOptionPane.YES_NO_OPTION);
}
}
}