public class sushu{
	public static void main(String[] args){
		final int NUMBER_OF_PRIMES=96;
    final int NUMBER_OF_PRIME_PER_LINE=12;
	  int count=0;
	  int number=2;
		System.out.println("The first 96 numbers are:\n");
		while(count <NUMBER_OF_PRIMES){
			boolean isPrime = true;
			for(int divisor=2;divisor<=number/2;divisor++){
				if(number%divisor==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				count++;
				if(count%NUMBER_OF_PRIME_PER_LINE==0){
					System.out.println(number);
				}
				else
				System.out.print(number+" ");
			}
			number++;
		}
	}
}