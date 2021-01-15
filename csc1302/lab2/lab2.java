/* 
csc1302 
Hakan Can Gunerli (John)
MW lectures
Lab time= normally 2pm but due to my surgery it is 8 am for me

I pledge on my honor that I have not given or received any unauthorized assistance on this assignment/.
*/ 

import java.util.*;

public class lab2
{

   public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int [] arr = new int [10]; // array init
       for(int i=0;i<10;i++){ 
        System.out.println("enter a number");
        arr[i]=sc.nextInt();
     // read and store the array val 
   }
   System.out.print("the reverse order is this: ");
    printReverse(arr);    
    System.out.println();
       System.out.println("The highest number is "+getLargest(arr));
       System.out.print("this is the array times two: ");
       computeTwice(arr);
  
   }
   
   public static void printReverse(int[] arr) {
    int [] rev = new int[arr.length]; // assign it to another array bc otherwise it would print the arr result 10 times. 
    for (int i = arr.length-1; i >= 0; i--) {  
         // print arr in reverse order 
         rev[arr.length-i-1] = arr[i]; // if those are not there, it would give you an out of bounds error. 
         // bc this is a void method, we have to print it ourselves. 
    }
    System.out.print("Here are you numbers in reverse: "+Arrays.toString(rev)); // to be formatted in the way, we have to turn it into a string. 
    }

   public static int getLargest(int[] arr) {  // get largest among all 
       int maxVal = arr[0];
       for(int i=1;i<arr.length;i++) {
           maxVal = Math.max(arr[i],maxVal); // using the math module, it will iterate through the array(starting from index zero) to find the biggest one. 
       }
         
       return maxVal;
   }


   public static int[] computeTwice(int[] arr){
    for (int i = arr.length-1; i >= 0; i--) { 
         // get the array that we have reversed and print it times two, same iteration we had in reverse, only difference is that we will *2 the results. 
         
        System.out.print(arr[i]*2 + " "); 

    }
    return arr;
}
}