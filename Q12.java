import java.util.ArrayList;

public class Q12 
{
    public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<String>();
		list.add("Srey");
        list.add("Fenil");
        list.add("Deep");
        list.add("Manan");
        list.add("Monil");
        System.out.println("Complete list: ");
        System.out.println(list);
        System.out.println("Portion of a list: ");
        System.out.println(list.subList(0, 2));
    }
}