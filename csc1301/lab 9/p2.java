/*
Hakan (John) Gunerli
lab9 FR 3PM
#002504797
*/
import java.util.Scanner;
public class p2 {


public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
System.out.print("what is your number? "); 
int inte= sc.nextInt(); 
int i=0; 


    for (i = 1; i < inte; i++) {
        System.out.println(i);

        
    }
int result= i+inte;
System.out.println("the total is "+result);
}


}