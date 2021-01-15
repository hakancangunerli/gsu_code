// Hakan Can Gunerli, CSC1302, 
/*
answer to the question 1: 
2 
2 4
2 4 6
2 4 6 8
2 4 6 8 10

*/

public class Recur {
	public static void main(String[] args) {
	  //	print(5); the answer is above, 
	   /*   (line 4)    
	  \    /         
	   \0          
		|\/      
		|        
	   / \        
  ____/___\____
*/


	 
  
	  System.out.println("cumulativeSum: " + CumulativeSum(4)); // this does not INCLUDE THE NUMBER WRITTEN, if you write 4, it'll check 1+2+3, not 1+2+3+4.
	  System.out.println("fibonacci: " + fib(4));
	}
  
	public static void print(int n) {
	  if (n != 0) {
		print(n - 1);
		printNum(n);
		System.out.println();
	  }
	}
  
	public static void printNum(int n) {
	  if (n != 0) {
		printNum(n - 1);
		System.out.print(n + n + " ");
	  }
	}
	public static int CumulativeSum(int n) {
	  if (n == 0) {
		return 0;
	  }
	  else if (n % 2 != 0) {
		return 0;
	  }
	  else return (n + CumulativeSum(n - 2));
	}
	public static int fib(int n) {
	  if (n == 0) return 0;
	  else if (n == 1) {
		return 1;
	  }
  
	  else {
		return fib(n - 1) + fib(n - 2);
	  }
	}
  }