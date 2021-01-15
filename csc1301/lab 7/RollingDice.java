public class RollingDice {

		public static void main(String[] args) {
	Rolling_Dice();
	}


	public static void Rolling_Dice() {
		int x= (int) (Math.random() * 6) + 1;  // 0,6
		int y= (int) (Math.random() * 6) + 1; // 0,6  
		int total= x+y; // add them
		System.out.println("first die is " + x );
		System.out.println("second die is "+ y);
		System.out.println("total is " + total); //print total which is x+y 
		if (total>6) {
			System.out.println("your total is higher than 6"); // if the total is higher than 6, print
		}
	}
}

			
			

	