import java.util.Scanner;
class MultiplicationTable
{
  public static void main(String args[])
  {
    int n, c;
    System.out.println("Enter an integer to print it's multiplication table");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    System.out.println("Multiplication table of " + n);

    for (c = 1; c <= 9; c++){
        System.out.println(n + "*" + c + " = " + (n*c));
        for(int j=1;j<=n;j++) {  // nested for loop
            System.out.print(n+" ");// prints the grid
            n = n * c; //without this, the code would not add new numbers, just create a 4x6 1-4 space. 
            }
        System.out.println(); // for proper grid
        }
    }

  }
