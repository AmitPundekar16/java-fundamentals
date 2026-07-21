
import java.util.*;

class largesmall
{
     int getlarge(List<Integer> l)
    {
      int large=0;
      large=l.get(0);
      for(int i:l)
      {
        if(i>large)
        {
            large=i;
        }
      }
      return large;
    }

     int getsmall(List<Integer> l)
    {
      int small=0;
      small=l.get(0);
      for(int i:l)
      {
        if(i<small)
        {
            small=i;
        }
      }
      return small;
    }
}
public class LargestSmallest
{
    public static void main(String[] arg)
    {
      List<Integer> l=new ArrayList<>(Arrays.asList(3, 14, 1, 3, 4, 7));

      largesmall a=new largesmall();
      System.out.println("Largest using own logic "+a.getlarge(l));
      System.out.println("Smallest using own logic: "+a.getsmall(l));
      System.out.println("Smallest using inbuilt method: "+Collections.max(l));
      System.out.println("Smallest using inbuilt method: "+Collections.min(l));

     
    }
}