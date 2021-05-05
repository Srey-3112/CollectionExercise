import java.util.*;
//
public class Q9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		list.add("White");
		list.add("Red");
		list.add("Black");
		list.add("Blue");
		
		System.out.println("list"+list);
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Srey");
		list1.add("Fenil");
		list1.add("Deep");
		list1.add("Dhruv");
		System.out.println("list1"+list1);
		 Collections.copy(list,list1);
		 
		 System.out.println("After Copy:");
		 System.out.println("list"+list);
		 System.out.println("list1"+list1);
	}
}