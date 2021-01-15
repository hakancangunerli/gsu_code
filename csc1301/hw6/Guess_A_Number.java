/*
//////////////////////////////////////////////////////////////
// Solution to Programming homework #6 //
// Name: Hakan Can Gunerli //
// Lab time: Friday 3:30PM//
// Program description: //
//////////////////////////////////////////////////////////////
*/

import java.util.Scanner; // calls scanner
public class Guess_A_Number 
{
   public static void main(String[] args) 
   {
      
	  String guess,maxNumber;
      int guessNumber,secret,maxSecretNumber;

	  int count = 0;

       
      Scanner input = new Scanner(System.in);
      while(true)
      {
         System.out.print("Enter maximum value for secret number: ");
         maxNumber = input.next(); 
           
         maxSecretNumber = Integer.parseInt(maxNumber);
         secret = (int) (Math.random() * maxSecretNumber + 1); // set a random number 
         System.out.println("A new secret number has been chosen");
          
         while(true){ 
            count; //increment the count by one every guess
            System.out.print("Enter Guess: "); 
            guess = input.next();
            guessNumber = Integer.parseInt(guess); // string to int 
              
            if (guessNumber == secret) // if they're the same, go to 'congrats '
            {
				System.out.println("Congrats, you won! ");
               System.out.println("won in "+count+" guesses"); 
               System.out.print("Play Again ?(Y/N):");
               String a = input.next(); // collect the user input 
               if(a.equals("y") || a.equals("Y")) // if the user says Y or y, go back playing the game 
               {
                  break; // goes back to the program 
               }
               else
               {
				System.out.println("thanks for playing, quiting now");
				  exit(0); // i had to write it like this, because that's the way it's written in python too. see exit()
               }
            }
               
            else if (guessNumber < secret)
               System.out.println("Too low; try again");
            else if (guessNumber > secret)
               System.out.println("Too high; try again");
         }
      }      
   }

	private static void exit(int i) {
		System.exit(0); // exits the program 
	}
}