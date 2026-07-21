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
        l2.add(0,"MMumbai");
        l2.add(0,"pune");
        System.out.println(l2);


        List<String> l3=new ArrayList<>();
        l3.add(0,"Banana");
        l3.add(1,"apple");
        l3.add("mango");
        l3.add("guava");
        l3.add("papaya");
        System.out.println(l3);
        for (int i = 0; i < l3.size(); i++) {
          if (l3.get(i).equals("mango")) {
             l3.remove(i);
             i--; 
            }
        }
         System.out.println(l3);

    }
}