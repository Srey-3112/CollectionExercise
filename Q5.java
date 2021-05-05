import java.util.*;
public class Q5
{
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("White");
		list.add("Red");
		list.add("Black");
		list.add("Blue");
		System.out.println("after update of 3rd element:"+list);
		list.remove(3);
		System.out.println("after removing 3rd element:"+list);
		
	}
}