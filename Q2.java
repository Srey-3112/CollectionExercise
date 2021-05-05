import java.util.ArrayList;

public class Q2 
{
    public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<String>();
        list.add("Srey");
        list.add("Fenil");
        list.add("Deep");
        list.add("Manan");
        list.add("Monil");
        for (String iterate : list) 
		{
            System.out.println(iterate);
        }
    }
}