
import java.util.*;

public class TwoDArrayList
{
    public static void main(String []arr)
    {
        List<List<Integer>> l1=new ArrayList<>();
         l1.add(new ArrayList<>());
        l1.get(0).add(1);
        System.out.println(l1);
        for(int i=0;i<l1.size();i++)
        {
            for(int j=0;j<l1.get(i).size();j++)
            {
                System.out.print(l1.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}