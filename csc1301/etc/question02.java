import java.util.Scanner;

public class question02 
{
	public static void main(String[] args) 
	{
		Scanner scannerr = new Scanner(System.in);
		System.out.println("Please enter an operator such as + , - , * or /:");
		char operator = scannerr.next().charAt(0);
		
		System.out.println("Please enter a integer");
		int num1 = scannerr.nextInt();
		System.out.println("Please enter a 2nd integer");
		int num2 = scannerr.nextInt();
		
		switch (operator)
			{
	        case '+' :
	        {System.out.print(num1 + num2);
	            break;}
	        case '-' :
	        {System.out.print(num1 - num2);
	            break;}
	        case '*' :
	        {System.out.print(num1 * num2);
	            break;}
	        case '/' :
	        {System.out.print(num1 / num2);
	            break;}
	        default :
	        {System.out.print("Your operator was not valid");
	            break;}
			}
	}
}
