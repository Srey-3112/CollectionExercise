import java.util.*;
public class Q8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		list.add("White");
		list.add("Red");
		list.add("Black");
		list.add("Blue");
		System.out.println("Before Sorting"+list);
		Collections.sort(list);
		System.out.println("After Sorting"+list);
	}
}