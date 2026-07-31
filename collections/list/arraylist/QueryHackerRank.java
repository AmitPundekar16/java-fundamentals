import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        List<Integer> l1=new ArrayList<>();
        
        int siz=sc.nextInt();
        
        for(int i=0;i<siz;i++)
        {
            l1.add(sc.nextInt());
        }
        
         siz=sc.nextInt();
         
         
         for(int i=0;i<siz;i++)
         {
            String st=sc.next();
            
            if(st.equals("Insert"))
            {
                l1.add(sc.nextInt(), sc.nextInt());
            }
            else{
                l1.remove(sc.nextInt());
            }
         }
        for (int i:l1) {
       System.out.print(i + " ");
}
        sc.close();
    }
}