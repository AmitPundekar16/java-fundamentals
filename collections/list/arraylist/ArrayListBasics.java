import java.util.ArrayList;
import java.util.List;

public class ArrayListBasics
{
    public static void main(String[] args)
    {
        List<Integer> l1=new ArrayList<>();
        l1.add(5);
        l1.add(19);
        System.out.println(l1);
       
        // To add each element at first position the add will shift current first to right and will not remove from list
        List<String> l2=new ArrayList<>();
        l2.add(0,"Mumbai");
        l2.add(0,"pune");
        System.out.println(l2);
    }
}