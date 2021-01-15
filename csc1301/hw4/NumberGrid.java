///////////////////////////////////////////////////////////////
// Homework #04                                              //
// Name: Hakan (John) Gunerli                                //
// Lab time: Friday - 3:00 PM                                //
// Program description: bonus programme						 //
///////////////////////////////////////////////////////////////  

public class NumberGrid {

	public static void main(String[] args) {
		printGrid(4, 6); // example loop 

		}
	public static void printGrid(int rows, int columns) {
		for(int i=1, total =0;i<=rows;i++) { 
			total = i; // without this, the numbers will added by the amount of rows.
			for(int j=1;j<=columns;j++) {  // nested for loop
				System.out.print(total+" ");// prints the grid
				total = total + rows; //without this, the code would not add new numbers, just create a 4x6 1-4 space. 
				}
			System.out.println(); // for proper grid
			}
		}
	}