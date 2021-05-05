import java.util.ArrayList;

public class Q20 
{
    public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<String>();
        list.add("Srey");
        list.add("Fenil");
        list.add("Deep");
        list.add("Manan");
        list.add("Monil");
		list.ensureCapacity(8);
        list.add("Maharshi");
        list.add("Raj");
        list.add("Dhruv");
        System.out.println("after increasing size of list: "+list);
    }
}