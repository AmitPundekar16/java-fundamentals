
import java.util.*;
public class RemoveEven
{
    public static void main(String []ar)
    {
        List<Integer> l1=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        System.out.println(l1);

        for(int i=l1.size()-1;i>=0;i--)
        {
            if(i%2==0)
            {
                System.out.println("hello");
                l1.remove(i);
            }
        }
        System.out.println(l1);

    }
}