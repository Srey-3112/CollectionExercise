import java.util.ArrayList;
import java.util.Collections;

public class Q10 
{
    public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<String>();
        list.add("Srey");
        list.add("Fenil");
        list.add("Deep");
        list.add("Manan");
        list.add("Monil");
        System.out.println("Before Shuffling:");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println("After Shuffling:");
        System.out.println(list);
    }
}