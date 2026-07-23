import java.util.*;

public class HashMapBasics
{
    public static void main(String[] args)
    {
        // here the output will be 35 bcoz it will override the value of current key
        Map<String,Integer> mp=new HashMap<>();
        mp.put("Amit",21);
        mp.put("Amit",35);
        System.out.println(mp);

        Map<String,Integer> mp1=new HashMap<>();
        mp1.put("Amit",21);
        mp1.put("Saumya",35);
        mp1.put("Vishal",43);
        System.out.println(mp1.get("Saumya")); // it will return the value of key Saumya
        System.out.println(mp1.get("Saumya")==mp1.get("Amit"));// it will return false bcoz the value of both keys are different
        System.out.println(mp1.get("Saumya").equals(mp1.get("Amit")));// it will return false bcoz the value of both keys are different
        System.out.println(mp1.containsKey("Vishal"));// it will return true
        System.out.println(mp1.containsValue(43));// it will return true

        // Q3. Create a HashMap<String, Integer> of item names and their prices. Loop through the map three different ways: using keySet(), using values(), and using entrySet(). Print what each one actually gives you access to, and note in a comment which one is most efficient if you need both the key and value together.
        HashMap<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 30);

        // Using keySet()
        System.out.println("Keys:");
        for (String key : items.keySet()) {
            System.out.println(key);
        }

        // Using values()
        System.out.println("Values:");
        for (Integer value : items.values()) {
            System.out.println(value);
        }

        // Using entrySet()
        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        List<Integer> ls=new ArrayList<>(items.values());
        Collections.sort(ls, Collections.reverseOrder());
        System.out.println(ls);
    }


}