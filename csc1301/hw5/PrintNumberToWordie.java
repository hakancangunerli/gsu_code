/*

*/
import java.util.*;


public class PrintNumberToWordie {

   public static void main(String[] args)
   {
      int number;
      
      Scanner input = new Scanner(System.in);     
   
      System.out.print("Type a number:");
      number = input.nextInt();
       
      
      
      if ( number >0 && number <=10){
            if (number == 1) {
         System.out.println("Number is: One");
      } 
      else if (number == 2) {
         System.out.println("Number is: Two");
      } 
      else if (number == 3) {
         System.out.println("Number is: Three");
      } 
      else if (number == 4) {
         System.out.println("Number is: Four");
      } 
      else if (number == 5) {
         System.out.println("Number is: Five");
      } 
      else if (number == 6) {
         System.out.println("Number is: Six");
      } 
      else if (number == 7) {
         System.out.println("Number is: Seven");
      } 
      else if (number == 8) {
         System.out.println("Number is: Eight");
      } 
      else if (number == 9) {
         System.out.println("Number is: Nine");
      } 
      else if (number == 10) {
         System.out.println("Number is: Ten");
      }
      else {
         System.out.println("your number is " + number );
      }
    
    }else{
         System.out.println("your number is invalid");
    }
 
 

      if (number % 2 == 0) {
         System.out.println( number + " is divisible by 2");
      } 
      else 
         System.out.println(number +" is not divisible by 2");  
   }
}