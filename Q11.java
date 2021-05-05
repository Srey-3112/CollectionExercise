import java.util.ArrayList;
import java.util.Collections;

public class Q11 
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Srey");
        list.add("Fenil");
        list.add("Deep");
        list.add("Manan");
        list.add("Monil");
        System.out.println("Before Reversing: ");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("After Reversing: ");
        System.out.println(list);
    }
}