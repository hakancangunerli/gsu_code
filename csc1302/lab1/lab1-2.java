// Hakan Gunerli Lab1 CSC1302 Lab on Mondays


import java.util.*;
public class Main
{

  public static void main ( String[] args )
  {
 Scanner scan=new Scanner(System.in);

        System.out.println("enter number of elements: ");

        int numofelements=scan.nextInt();

        int arr[]=new int[numofelements];

        System.out.println("enter elements: ");

for(int index=0;index<numofelements;index++){//this will read the input by the user for the array values
            arr[index]=scan.nextInt();

        }

    // print the boolean result
    if ( isSorted(arr) )
      System.out.println( "the given array is in order" );
    else
      System.out.println( "the given array is NOT in order" );

   }
 public static boolean isSorted( int[] array )
  {
    boolean order = true;
    
    for ( int incidence=0; incidence<array.length-1 && order; incidence++ )
    {
      order = array[incidence] <= array[incidence+1];      
    }
    return order;
  }

}