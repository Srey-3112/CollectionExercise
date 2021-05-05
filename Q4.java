import java.util.*;
public class Q4
{
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("White");
		list.add("Red");
		list.add("Black");
		list.add("Blue");
		System.out.println(list);
		list.add(0,"Yellow");
		System.out.println("insertion at first index"+list);
		System.out.println("second element from list:"+list.get(2));
		list.set(3,"violet");
		System.out.println("after update of 3rd element:"+list);
		list.remove(3);
		System.out.println("after removing 3rd element:"+list);
		
	}
}
		