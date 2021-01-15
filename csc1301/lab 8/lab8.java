package lab8;
import java.util.Scanner;
import java.util.*;


public class lab8 {

	  public static void main (String[]args)
	  {
	    PrintSquare();
	    GradeAverage();
	    Add2Integers();
	    SumProductMinMax3();

	  }
	  public static void PrintSquare ()
	  {

	    System.out.println ("Please type a number:");
	    Scanner sc = new Scanner (System.in);
	    int i = sc.nextInt ();

	    System.out.println ("The square of that number is  " + (i * i));

	  }
	  public static void GradeAverage ()
	  {
	    Scanner sc = new Scanner (System.in);
	    System.out.println ("Enter your name");
	    String name = sc.next ();

	    System.out.println ();

	    System.out.println ("first grade");
	    float firstGrade = sc.nextFloat();
	    System.out.println ("second grade");
	    float secondGrade = sc.nextFloat();
	    System.out.println ("third grade");
	    float thirdGrade = sc.nextFloat();

	    float totalGrade = ((firstGrade + secondGrade + thirdGrade) / 3);
	    System.out.println ("hello " + name + " the grade average is " +
				totalGrade);

	  }
	  public static void Add2Integers ()
	  {
	    Scanner sc = new Scanner (System.in);
	    System.out.println ("please provide a number");
	    int firstNumber = sc.nextInt ();
	    System.out.println ("please provide the second number");
	    int secondNumber = sc.nextInt ();
	    System.out.println ("The total is " + (firstNumber + secondNumber));


	  }
	  public static void SumProductMinMax3 ()
	  {

	    Scanner sc = new Scanner (System.in);
	    System.out.println ("Enter 1st integer ");
	    int numberOne = sc.nextInt ();
	    System.out.println ("Enter 2st integer ");
	    int numberTwo = sc.nextInt ();
	    System.out.println ("Enter 3rd integer ");
	    int numberThree = sc.nextInt ();
	    System.out.println ("The sum is:" +
				(numberOne + numberTwo + numberThree));
	    System.out.println ("The product is:" +
				(numberOne * numberTwo * numberThree));

	    if (numberOne <= numberTwo && numberOne <= numberThree)
	      System.out.println ("The min  is " + numberOne);

	    else if (numberTwo <= numberOne && numberTwo <= numberThree)
	      System.out.println ("The min  is " + numberTwo);

	    else
	      System.out.println ("The min  is " + numberThree);

	    if (numberOne >= numberTwo && numberOne >= numberThree)
	      System.out.println ("The max  is " + numberOne);

	    else if (numberTwo >= numberOne && numberTwo >= numberThree)
	      System.out.println ("The max  is " + numberTwo);

	    else
	      System.out.println ("The max  is " + numberThree);



	  }



	}

