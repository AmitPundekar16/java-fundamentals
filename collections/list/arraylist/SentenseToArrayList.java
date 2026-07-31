import java.util.*;

public class SentenseToArrayList
{
   public static void main(String[] ar)
   {
    String str="Adobe Hackathon twenty twenty six";
    String []str1=str.split(" ");
    List<String> l1=new ArrayList<>();
    Collections.addAll(l1,str1);
    Collections.sort(l1);
    System.out.println(l1);
   }
}