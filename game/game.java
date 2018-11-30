import java.util.Scanner;
public class game{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int C=0,H=0;
		int number = (int)(Math.random() * 3);
		System.out.println("请选择:");
		System.out.print("scissor(0)rock(1)paper(2):\n");
	  for(int i=1;i <= 3;i++){
		  int answer = input.nextInt();
		  while(C < 1 && H < 1 && answer <= 2 && answer >= 1){	
        if(number == 0){
 	  	    System.out.println("电脑出剪刀");
          if(answer == 0) {
            System.out.println("平手");
            number = (int)(Math.random() * 3);        
          } else if (answer == 1) {
            System.out.println("玩家胜出");
            H++;
            number = (int)(Math.random() * 3);
          } else {
              System.out.println("电脑胜出");
              C++;
              number = (int)(Math.random() * 3);
          }
      	}
        if(number == 1){
        	System.out.println("电脑出石头");
          if (answer == 0) {
            System.out.println("电脑胜出");
            C++;
            number = (int)(Math.random() * 3);
          } else if (answer == 1) {
              System.out.println("平手");
              number = (int)(Math.random() * 3);
          } else {
              System.out.println("玩家胜出");
              H++;
              number = (int)(Math.random() * 3);
          }
        }
        if(number == 2){
          System.out.println("电脑出布");
            if(answer == 1) {
              System.out.println("电脑胜出");
              C++;
              number = (int)(Math.random() * 3);
            } else if (answer == 2) {
                System.out.println("平手");
                number = (int)(Math.random() * 3);
            } else {
                System.out.println("玩家胜出");
                H++;
                number = (int)(Math.random() * 3);
            }    
        }          
    }
  }
    if(C == 2){
      System.out.println("you lose");
    }else{
      System.out.println("you win!"); 
    }   
  } 
}