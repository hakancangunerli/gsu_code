
/*
Hakan (John) Gunerli
CSA170 
February 20. 2020

*/
public class MysteryNums { 

    public static void main(String[] args) { 

        int x = 15; 

        sentence(x, 42);      // 15, 42 (fifteen comes from the int x ) (42 is provided) 

  

        int y = x - 5; 

        sentence(y, x + y);   // 10, 25 (y=15-5 which is 10,  x=15 so x+y= 25  

} 

public static void sentence(int num1, int num2) { 

    System.out.println(num1 + " " + num2); 

} 

} 