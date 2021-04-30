// Hakan Gunerli , 002504797 Lab13 
import java.util.*;

public class Lab13 
{
    public static void main(String[] args) {
        String str = "I like queues but queues do not like me";
        ArrayList<String> toIgnore = new ArrayList<String>();
        toIgnore.add("queues");
        System.out.println(frequency(str, toIgnore)); // Should return "like"
    }
    // my code starts from here.

    public static String frequency(String str, List<String> toIgnore) 
    {
        HashMap<String, Integer> hmap = new HashMap<>(); // we'll create a hasmap
        String array[] = str.split(" ");
        String result = "";
        int value, x = 0;
        String key = array[x];

        for (int i = 0; i < array.length; i++) 
        {
            key = array[i];

            if (hmap.containsKey(null)) 
            {
                System.out.println("value is invalid."); 
            }
            else if (hmap.containsKey(key)) // if hashmap contains the key
            {
                value = hmap.get(key); // the value is the key from hmap

                if (value > -1 && (!toIgnore.contains(key))) // if the value is larger than -1, and it does not contain
                                                             // the key,
                {
                    value = -1; // make value -1
                    result = key; // result is the key.
                }
                value++; // iterate
                hmap.put(key, value); // put the value into its respective place.
            }
            else
            {
                hmap.put(key, 1); // otherwise put this valuie
            }
        }
        return result;
    }
}