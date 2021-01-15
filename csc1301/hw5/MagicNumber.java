/////////////////////////////////////////////////////////////
// Solution to Programming Project 3 homework #4 //
// Name: Hakan (John) Gunerli //
// Lab time: FR 3:30PM //
// Program description: project3 //
////////////////////////////////////////////////////////////
import java.lang.Math;
import java.util.*;



public class MagicNumber{

    public static void main(String[] args) {
        int number;
        int majik = (int) ((Math.random() * ((100 - 0) + 1)) + 0);
System.out.println("secret number is "+ majik);
        Scanner input = new Scanner(System.in);     
     
        System.out.print("Type a number:");
        number = input.nextInt();

        if (number < majik){
            System.out.println("your guess is less than the magic number");
        }else if(number== majik){
        System.out.println("congrats, you guessed it right!");
        }else{
            System.out.println("your guess is higher");
        }





    }
}