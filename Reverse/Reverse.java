import java.util.Arrays;
public class Reverse{
public static void main(String[] args){
int[] list1={1,2,3,4,5,6,7,8};
int[] list2=reverse(list1);

/*       System.out.print("{");
for(int i=0;i<list2.length;i++){
if(i<list2.length-1){
System.out.print(list2[i]+",");
}
if(i==list2.length-1){
System.out.print(list2[i]);
}
}
System.out.print("}");       */

System.out.print(Arrays.toString(list2));
}
public static int[] reverse(int[] list){
int[] result=new int[list.length];
for(int i=0,j=list.length-1;i<list.length;i++,j--){
result[j]=list[i];
}
return result;
}
}