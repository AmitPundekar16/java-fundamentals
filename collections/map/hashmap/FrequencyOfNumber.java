import java.util.*;


public class FrequencyOfNumber
{
    public static void main(String arr[])
    {
        int []ar={1,1,12,2,2,1,2,1,21,21,23,2,5,5,1,1,1,1};
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<17;i++)
        {
            hm.put(ar[i],0);
        }
         for(int i=0;i<ar.length;i++)
        {
            int val=hm.get(ar[i]);
            hm.put(ar[i],++val);
        }
        System.out.println(hm);
    }
}