import java.util.Scanner;
class question5
{
  public static void main(String args[])
  {
    int input;
    int times;

    System.out.println("input for multiplication");
    Scanner sc = new Scanner(System.in);

    input = sc.nextInt(); // asks for input 
    System.out.println("Multiplication table of " + input);  // prints the results

    for (times = 1; times <= 9; times++) // start from times 1 to times 9 
      System.out.println(input + "*" + times + " = " + (input*times)); // print
  }
}


