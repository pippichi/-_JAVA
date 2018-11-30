import javax.swing.*;
import java.util.*;
public class TestArrayList{
	public static void main(String[] args){
		java.util.ArrayList list=new java.util.ArrayList();
		Loan loan=new Loan();
		JFrame frame=new JFrame();
		Circle Circle=new Circle();
		Date Date=new Date();
		list.add(loan);
		list.add(Date);
		list.add("mymy");
		list.add(frame);
		list.add(Circle);
		for(int i=0;i<=4;i++)
		  System.out.println(list.get(i).toString());
		}
	}
