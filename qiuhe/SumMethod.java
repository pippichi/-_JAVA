public class SumMethod{
	public static void main(String[] args){
		int i=124,j=256;
		int k=sum(i,j);
		System.out.println("i=124,j=256,他们的连续和为："+k);
		}
	public static int sum(int i1,int i2){
		int sum=0;
		for(int i=i1;i<=i2;i++){
			sum+=i;
		}
		return sum;
		}
}