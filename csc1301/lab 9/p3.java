/*
Hakan (John) Gunerli
lab9 FR 3PM
#002504797
*/
import java.util.Scanner;

public class p3 {

    public static void main(String[] args) {
       
       Scanner sc= new Scanner(System.in);
       System.out.print("initial number ");
       int numfirst=sc.nextInt(); 
    
       System.out.print("final number ");
       int numsec=sc.nextInt(); 

           System.out.print("increment number ");

        for (int numthird=sc.nextInt(); numfirst <= numsec;numfirst+=numthird) {   /// if num1 is less than num2, add num3 to num1 and print the new num1 
            System.out.println(numfirst); 
        }
    }
}