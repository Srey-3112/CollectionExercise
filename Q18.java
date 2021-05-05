import java.util.ArrayList;

public class Q18 
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
        if (list.isEmpty() == true)
		{
            System.out.println("list is empty");
		}
        else 
		{
            System.out.println("List is not empty...");
            
        }
		
        
        
    }
}