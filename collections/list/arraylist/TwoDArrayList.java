
import java.util.*;

public class TwoDArrayList
{
    public static void main(String []arr)
    {
        List<List<Integer>> l1=new ArrayList<>();
         l1.add(new ArrayList<>());
         l1.add(new ArrayList<>());
         l1.add(new ArrayList<>());
         l1.add(new ArrayList<>());

        l1.get(0).add(5);
        l1.get(0).add(10);
        l1.get(1).add(3);

        l1.get(1).add(4);
        l1.get(2).add(3);
        l1.get(2).add(1);


        l1.get(3).add(7);
        l1.get(3).add(2);

        int sum=0;

        System.out.println(l1);

        for(int i=0;i<l1.size();i++){
            for(int j=0;j<l1.get(i).size();j++)
            {
              sum+=l1.get(i).get(j);
            }
        
        }
        System.out.println(sum);
       


        Comparator<List<Integer>> cmp=new Comparator<List<Integer>>()
        {
            public int compare(List<Integer> i,List<Integer> j)
            {
               if(i.get(0)>j.get(0))
               {
                return 1;
               }
               else
               {
                return -1;
               }
            }
        };

        Collections.sort(l1,cmp);
        System.out.println(l1);
    }
}