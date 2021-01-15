//////////////////////////////////////////////////////////////
// Solution to Programming Project icalledyou//
// Name: Hakan John Gunerli//
// Lab time:  Friday 3PM-4:40PM //
// Program description: Homework 4 //
////////////////////////////////////////////////////////////// 


import java.util.Scanner;
public class payroll{

    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 
  System.out.println("please provide the name");
 String name= sc.next();
 
 System.out.println("please provide the number of hours you worked");
 int numHours= sc.nextInt();

 System.out.println("please provide pay hours ");

 int payHour= sc.nextInt();

 System.out.println("please provide tax %  ");
 double tax= sc.nextDouble();

 
 System.out.println(tax);


  //gross pay = numHours * payHour 
  System.out.println("hello "+ name);

double gross= numHours * payHour;
System.out.println("your total gross amount is.."+ gross);
double totaltax= tax * gross; 
System.out.println("your total tax amount is.."+ totaltax);
double net= gross - totaltax; 
System.out.println("your total net amount is.."+ net);

 // tax = the tax 


 //net pay = gross pay - tax 


    }
}
