/*
Hakan (John) Gunerli
CSA170 
February 20. 2020
Lab 6 Q3
*/





public class NumberPractice { 

public static void main(String[] args) { 

    int myAge= 21;   

        double myGpa= 3.3;   
 

 System.out.println("my age is " +myAge ); 

 System.out.println("half of my age is " + myAge*2 ); 

 System.out.println("three times my age is " + myAge*3 ); 

 double a_half= myAge; 

 System.out.println("half of my age is " + a_half/2 ); 

  

 System.out.println("my gpa is "+ myGpa ); 

 double gpa_half= myGpa; 

  

 String tenDigits= String.format("%.9g%n", gpa_half /2 ); 

 System.out.println("half of my gpa is " + tenDigits ); 

  

 

} 

} 