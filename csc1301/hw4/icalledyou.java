//////////////////////////////////////////////////////////////
// Solution to Programming Project icalledyou//
// Name: Hakan John Gunerli//
// Lab time:  Friday 3PM-4:40PM //
// Program description: Homework 4, Discussed with Sahil Posa //
////////////////////////////////////////////////////////////// 



import java.util.Scanner;

public class icalledyou {

    public static  void main(String args[]){
 product(10,15);
    }


public static void product(int x, int y ) {
Scanner sc =  new Scanner(System.in);
System.out.println("provide the first number");

x=sc.nextInt();
System.out.println("provide the second number");

y=sc.nextInt(); 

int times = x*y; 
System.out.println("the product is "+ times);

if (x>y){
    System.out.println("the big number is "+ x);
}else{
    System.out.println("the big number is "+ y);
}
    
}

}