/* 
    Hakan Can Gunerli, Lab10 DS
*/ 


import java.util.*;
public class Lab10 {
    public static void main(String []args){
        int[] arr = {1, 5, 3, 4, 2};
        int k = 3;
        long start = System.currentTimeMillis();
        System.out.println("Count is "+ solve_with_Hash(arr,k)); //should be 2 
        System.out.println("Total execution time (taken by solve_with_Hash): " + (System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        System.out.println("\n\nCount is "+ solve_with_Sort(arr,k)); //should be 2 
        System.out.println("Total execution time (taken by solve_with_Sort): " + (System.currentTimeMillis()-start));
    }
    public static int solve_with_Sort(int[] arr, int k){  // my code here, 
         int counter = 0;
        int left_side = 0;  
        int right_side = 0;
        Arrays.sort(arr); // sort in order before playing with it. 
        while(right_side < arr.length){
            int array_sub = arr[right_side] - arr[left_side];
            if(array_sub == k){
                left_side++;
                right_side++;
                counter++;
                
            }else if(array_sub > k){
                left_side++;
            }else{
                right_side++;
            }
        }
        return counter;
    }
    public static int solve_with_Hash(int[] arr, int k){ // my code here, 
        int counter = 0;
        int i=0; 
        HashSet<Integer> hash = new HashSet<Integer>();
        for(i = 0; i < arr.length; i++) // iterate through it 
        {
            int key_val = arr[i]; // make value equal to the index, add to hash. 
            hash.add(key_val);
        }
        for(i = 0; i < arr.length; i++)
        {
            if(hash.contains(arr[i] + k) || hash.contains(arr[i] - k)) // if it contains the value added or subtracted, remove it from hash. 
            {
                counter++;
                hash.remove(arr[i]);
            }
        }
        return counter;
    }
}