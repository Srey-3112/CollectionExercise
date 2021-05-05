import java.util.*;
public class Q7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		list.add("White");
		list.add("Red");
		list.add("Black");
		list.add("Blue");
		System.out.println(list);
		
		System.out.println("enter the name of colour you want search:");
		
		String colourSearch=sc.next();
		boolean flag=false;
		int j=0;
		for(;j<list.size();j++)
		{
			if(colourSearch.equals(list.get(j)))
			{
					flag=true;
					break;
			}
		}
		if(flag)
		{
			System.out.println("Searched element:"+list.get(j));
		}
		else
		{
			System.out.println("not found....");
		}
	}
}