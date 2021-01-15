/*
//////////////////////////////////////////////////////////////
// Solution to Programming homework #6 //
// Name: Hakan Can Gunerli //
// Lab time: Friday 3:30PM//
// Program description: //
//////////////////////////////////////////////////////////////
*/


import java.util.Scanner;

public class Diamond_R_4_Ever {
		public static void main(String[] args)
		{
			Scanner scan= new Scanner(System.in);
			System.out.print("fyi, the result would be 2n+1 squared ");
			System.out.print("enter value:");
			int n=scan.nextInt();
			int i=0;
			int dots=0;

			for(i=1;i<=2*n+1;i++)
			{
				for(dots=1;dots<=(Math.abs(i-n-1));dots++)
				{System.out.print("¤");} // left side 

				for(dots=1;dots<=2*(n-Math.abs(i-n-1))+1;dots++) // makes 2n-1 
				{System.out.print("*");} // the actual diamond
 

				for(dots=1;dots<=(Math.abs(i-n-1));dots++) // makes 2n-1 
				{System.out.print("¤");} //right side 


				System.out.println();
			}
		}
}