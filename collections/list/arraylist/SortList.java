
import java.util.*;

public class SortList
{
    public static void main(String []ar)
    {
        int arr[]={5,4,2,1,3};
        List<Integer> l1=new ArrayList<>();
        for(int i:arr)
        {
            l1.add(i);
        }

        Collections.sort(l1);
        System.out.println(l1);
    }
}