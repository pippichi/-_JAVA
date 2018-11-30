public class MultiplicationTable{
	public static void main(String[] args){
		System.out.println("                ³Ë·¨±í");
		System.out.print("  ");
		for(int i=1;i<=9;i++)
		  System.out.print("   "+i);
		  System.out.println("\n___________________________________________");
		for(int j=1;j<=9;j++){
			System.out.print(j+"|");
			for(int i=1;i<=9;i++){
				if(j>=i && i*j<=9)
				System.out.print("   "+i*j);
			  else if(j>=i)
			  System.out.print("  "+i*j);
				}
				System.out.println();
			}
		}
	}