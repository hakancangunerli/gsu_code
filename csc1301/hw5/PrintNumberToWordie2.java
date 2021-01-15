/////////////////////////////////////////////////////////////
// Solution to Programming Project 3 homework #4 //
// Name: Hakan (John) Gunerli //
// Lab time: FR 3:30PM //
// Program description: printwordie2//
////////////////////////////////////////////////////////////
import java.util.*;
public class PrintNumberToWordie2 {

   public static void main(String[] args)
   {
      int number;
      
      Scanner input = new Scanner(System.in);     
   
      System.out.print("Type a number:");
      number = input.nextInt();
       switch (number) {
            case 1:  System.out.println("your number is one"); break;
            case 2:  System.out.println("your number is two"); break;
            case 3:  System.out.println("your number is three"); break;
            case 4:  System.out.println("your number is four"); break;
            case 5:  System.out.println("your number is five"); break;
            case 6:  System.out.println("your number is six"); break;
            case 7:  System.out.println("your number is seven"); break;
            case 8:  System.out.println("your number is eight"); break;
            case 9:  System.out.println("your number is nine"); break;
            case 10: System.out.println("your number is ten"); break;
            default: System.out.println("Not a number!"); break;
        }

      if (number % 2 == 0) {
         System.out.println( number + " is divisible by 2");
      } 
      else 
         System.out.println(number +" is not divisible by 2");  
   }
}