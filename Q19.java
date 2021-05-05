import java.util.*;

public class Q19 
{
    public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<String>(20);
         list.add("Srey");
        list.add("Fenil");
        list.add("Deep");
        list.add("Manan");
        list.add("Monil");
        System.out.println(list);
        System.out.println("list having size:"+list.size());
        list.trimToSize();
        System.out.println("List size after trimming:"+list.size());
        System.out.println(list);
    }
}