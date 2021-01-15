/* 
Hakan Can Gunerli 
Lab 11 Friday 3:30PM  #002504797
Description: Use some simple nested for loops to generate all possible coordinates from (0,0) up to (5,5).
*/


public class Main {

		public static void main( String[] args )
		// a represents the first coordinate, 
		//b does the second
		{
for(int x=0; x<6; x++){
      for(int y=0; y<6; y++){
        System.out.print("(" + x + "," + y + ")"); // print them 
      }
      System.out.println(" "); // make it neat 
    }
		}
	}