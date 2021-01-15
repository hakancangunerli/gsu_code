/*
//////////////////////////////////////////////////////////////
// Solution to Programming homework #6 //
// Name: Hakan Can Gunerli //
// Lab time: Friday 3:30PM//
// Program description: //
//////////////////////////////////////////////////////////////
*/

import java.util.Scanner;
public class Full_XmasTree {
	public static void main(String[] args){
	 Scanner input = new Scanner(System.in);
	
	 int print; //where the asterisks are printed,
	 int start; // where it starts,
	 int j; // for shape,

	 System.out.print("How tall would you like your tree to be? "); 
	 int columns = input.nextInt(); // asks for input from the user 
	 
	 for ( start= 0; start < columns; start++){ 


	

		for(j = columns; j > start; j--){  

			System.out.print(" ");// fixes the tree shape, otherwise prints the asterisks to the side 

		}

			for (print = 1; print < start + 1; print++) {
				System.out.print("* ");
			} // prints the asterisks
		System.out.println();  // goes to next line after 

	}
	}
}