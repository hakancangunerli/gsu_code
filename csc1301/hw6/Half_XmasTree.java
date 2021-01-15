/*
//////////////////////////////////////////////////////////////
// Solution to Programming homework #6 //
// Name: Hakan Can Gunerli //
// Lab time: Friday 3:30PM//
// Program description: //
//////////////////////////////////////////////////////////////
*/

import java.util.Scanner; 

class Half_XmasTree
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Pick size of the tree? (put how many rows)");
      int count = input.nextInt();
      int i = 1;
      int j = i;

      for(i = 1; i <= count; i++) // after everything is printed, goes to other count
      {
         for(j = i; j <= count; j++)
         {
            System.out.print("*"); // prints the asterisks 
         }
         System.out.println(""); // go to the next line 
      }
   }
}