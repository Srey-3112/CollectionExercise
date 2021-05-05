import java.util.ArrayList;

public class Q13 
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
        ArrayList<String> list2 = new ArrayList<String>();
        list.add("Srey");
        list.add("Fenil");
        list.add("Dhruv");
        list.add("Manan");
        list.add("Monil");
        System.out.println("comparing list: ");
        boolean compare = list.equals(list2);
        System.out.println(compare);
       
    }
}