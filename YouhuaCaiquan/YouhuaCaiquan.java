import java.util.Scanner;
public class YouhuaCaiquan{
	public static void main(String[] args){
	  int Computer = 0,Human = 0;
		Scanner input=new Scanner(System.in);
		int number = (int)(Math.random() * 3);
		System.out.println("��ѡ��:");
		System.out.print("scissor(0)rock(1)paper(2):\n");	
    while(Computer < 2 && Human < 2){	
    	int answer = input.nextInt();
    	if(answer > 2 || answer < 0){
				System.out.println("wrong!");
				continue;
			}	 
      if(number == 0 && answer == 1){
        System.out.println("���Գ�����");
        System.out.println("���ʤ��");
        Human++;       
      	}
      else if (number == 0 && answer == 2){ 
        System.out.println("���Գ�����");
        System.out.println("����ʤ��");
        Computer++;        
      	}
      else if(number == 0 && answer == 0){ 
        System.out.println("���Գ�����");
        System.out.println("ƽ��");          
      	}
      else if(number == 1 && answer == 1){ 
        System.out.println("���Գ�ʯͷ");
        System.out.println("ƽ��");         
      	}
      else if(number == 2 && answer == 2){
        System.out.println("���Գ���");
        System.out.println("ƽ��");         
      	}
      else if(number == 1 && answer == 2){
        System.out.println("���Գ�ʯͷ");
        System.out.println("���ʤ��");
        Human++;          
      	}
      else if(number == 1 && answer == 0){ 
        System.out.println("���Գ�ʯͷ");
        System.out.println("����ʤ��");  
      	Computer++;      	
      	}  
      else if(number == 2 && answer == 0){ 
      	System.out.println("���Գ���");
     	 	System.out.println("���ʤ��"); 
        Human++;         
      	}          
      else{
        System.out.println("���Գ���");
        System.out.println("����ʤ��"); 
        Computer++;         
      	}
    }                     
    if(Computer == 2)
      System.out.println("you lose");
    else if(Human ==2)
      System.out.println("you win!"); 
  }
}