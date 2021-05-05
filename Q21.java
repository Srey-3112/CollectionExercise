import java.util.ArrayList;

public class Q21 
{
    public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<String>();
        list.add("Srey");
        list.add("Fenil");
        list.add("Deep");
        list.add("Manan");
        list.add("Monil");
        System.out.println("Before Replacing: "+list);
        list.set(2, "Monil");
        System.out.println("After Replacing: "+list);
    }
}