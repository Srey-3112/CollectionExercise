import java.util.ArrayList;

public class Q22 
{
    public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<String>();
        list.add("Srey");
        list.add("Fenil");
        list.add("Deep");
        list.add("Manan");
        list.add("Monil");
        System.out.println(list);
        System.out.println("printing according to position:");
        for (int i = 0; i < list.size(); i++) 
		{
		System.out.println("{"+i+"}"+list.get(i));
        }
    }
}