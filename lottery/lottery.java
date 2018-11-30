import java.util.Scanner;
public class lottery{
	public static void main(String[] args){
		int number=(int)(Math.random() * 100);
		Scanner input=new Scanner(System.in);
		System.out.println("Please put in one number:two digits");
		int guess=input.nextInt();
		int guess1=guess/10;
		int guess2=guess%10;
		int number1=number/10;
		int number2=number%10;
		System.out.println("The lottery number is:"+number);
		if(guess == number)
		    System.out.println("You win $10000!");
		  else if(guess1 == number2 && guess2 == number1)
		      System.out.println("You win $3000!");  
		    else if(guess1 == number2 || guess1 == number1 || guess2 == number1 || guess2 == number2)
		        System.out.println("You win $1000!");
		      else
		          System.out.println("Sorry");  
		}
	}