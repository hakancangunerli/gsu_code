import java.util.*;
public class SwapPairs {
    public static void main(String[] args) {
      ArrayList<String> input = new ArrayList<String>();
        input.add("madam");
                input.add("i");
                        input.add("am");
                        input.add("your");
                        input.add("adam");
                                swapPairs(input);
    }

    public static void swapPairs(ArrayList<String> input) {
        int i=0;
        int iteration = 0;
        while ( iteration < input.size() / 2 ) {
            String temp = input.get(i);   
            input.set(i, input.get(i+1)); 
            input.set(i+1, temp); 
            i += 2; 
            iteration++;
        }
        System.out.println(input);
    }
}