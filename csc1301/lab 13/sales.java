import java.util.Scanner;

public class Sales {

       public static void main(String[] args) {

              Scanner scan = new Scanner(System.in);

              System.out.print("amount of salespeople: ");

              int[] sales = new int[scan.nextInt()];

              int sum;
              int salesperson=0;
              for (salesperson=0; salesperson<sales.length; salesperson++) {

                     System.out.print("enter sales for person " + (salesperson+1) + ": ");

                     sales[salesperson] = scan.nextInt();

              }

              System.out.println("\nSalesperson Sales:");



              sum = 0;

              int max = 0;

              int min = 0;

              for (salesperson=0; salesperson < sales.length; salesperson++) {

                     System.out.println(" " + (salesperson+1) + " " + sales[salesperson]);

                     if(sales[salesperson] > sales[max]) {

                           max = salesperson;

                     }

                     else if(sales[salesperson] < sales[min]) {

                           min = salesperson;

                     }

                     sum += sales[salesperson];

              }

              System.out.println("\nsales: " + sum);

              System.out.println(" sales averaged, : " + sum /(salesperson));
              System.out.println("Salesperson " + (min+1) + " had the lowest sale with $" + sales[min] + ".");

              System.out.println("Salesperson " + (max+1) + " had the highest sale with $" + sales[max] + ".");


              System.out.print("Enter a sales amount: ");

              int cutoff = scan.nextInt();

              int howmany = 0;

              System.out.println("exceeded the cutoff,");


              for(salesperson = 0; salesperson < sales.length; ++salesperson) {

                     if(sales[salesperson] > cutoff) {

                           System.out.println(" " + (salesperson+1) + " " + sales[salesperson]);

                           howmany++;

                     }

              }

              System.out.println("\n" + howmany + " salesperson(s) exceeded the cutoff.");

       }

}