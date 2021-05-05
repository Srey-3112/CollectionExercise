import java.util.ArrayList;

public class Q17 
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
        list.removeAll(list);
        System.out.println("After removing all Elements:");
        System.out.println(list);
    }
}