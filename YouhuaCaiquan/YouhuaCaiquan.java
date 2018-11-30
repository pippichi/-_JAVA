import java.util.Scanner;
public class YouhuaCaiquan{
	public static void main(String[] args){
	  int Computer = 0,Human = 0;
		Scanner input=new Scanner(System.in);
		int number = (int)(Math.random() * 3);
		System.out.println("请选择:");
		System.out.print("scissor(0)rock(1)paper(2):\n");	
    while(Computer < 2 && Human < 2){	
    	int answer = input.nextInt();
    	if(answer > 2 || answer < 0){
				System.out.println("wrong!");
				continue;
			}	 
      if(number == 0 && answer == 1){
        System.out.println("电脑出剪刀");
        System.out.println("玩家胜出");
        Human++;       
      	}
      else if (number == 0 && answer == 2){ 
        System.out.println("电脑出剪刀");
        System.out.println("电脑胜出");
        Computer++;        
      	}
      else if(number == 0 && answer == 0){ 
        System.out.println("电脑出剪刀");
        System.out.println("平手");          
      	}
      else if(number == 1 && answer == 1){ 
        System.out.println("电脑出石头");
        System.out.println("平手");         
      	}
      else if(number == 2 && answer == 2){
        System.out.println("电脑出布");
        System.out.println("平手");         
      	}
      else if(number == 1 && answer == 2){
        System.out.println("电脑出石头");
        System.out.println("玩家胜出");
        Human++;          
      	}
      else if(number == 1 && answer == 0){ 
        System.out.println("电脑出石头");
        System.out.println("电脑胜出");  
      	Computer++;      	
      	}  
      else if(number == 2 && answer == 0){ 
      	System.out.println("电脑出布");
     	 	System.out.println("玩家胜出"); 
        Human++;         
      	}          
      else{
        System.out.println("电脑出布");
        System.out.println("电脑胜出"); 
        Computer++;         
      	}
    }                     
    if(Computer == 2)
      System.out.println("you lose");
    else if(Human ==2)
      System.out.println("you win!"); 
  }
}