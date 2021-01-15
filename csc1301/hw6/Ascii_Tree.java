/*
//////////////////////////////////////////////////////////////
// Solution to Programming homework #6 //
// Name: Hakan Can Gunerli //
// Lab time: Friday 3:30PM//
// Program description: //
//////////////////////////////////////////////////////////////
*/

public class Ascii_Tree {
    public static void main(String args[]) {
        for(int size=1; size<=10; size++){
            for(int look=1; look<=10-size; look++){
                System.out.print(" "); // fix the look 
            } 
            for(int half=1;half<=size-1; half++){
                System.out.print("\\"); // one half, prints the left side only without the '/' for loop 
                
            }
            for(int body=0;body<2; body++){
              System.out.print("|"); // the body of the 'tree'
            }
            for(int other_half=1; other_half<=size-1; other_half++){
              System.out.print("/");  // prints half without it 
            }
          System.out.println(); // fix the look , otherwise prints line by line next to it 
        }
    }
}