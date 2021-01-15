/*
Hakan (John) Gunerli
CSA170 
February 20. 2020
Lab 6 Q2
*/



public class SecondQuestion { 


public static void printSquare(int minimum , int maximum) { 
 
  
int x=0;  
int y=0; 

for (x = 0; x <= maximum-minimum;  x++) {  

for (y = 0; y <= maximum-minimum;  y++) {  


System.out.print((y+x)%(   maximum-minimum+ 1 ) + maximum-minimum);  

  

} 

System.out.print("\n"); 

}  

} 

public static void main(String[] args) { 

printSquare(3,6); 


} 

} 