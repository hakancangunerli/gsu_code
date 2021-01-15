public class NumbersDemo 
{	 
	public static void main(String args[])
	{
		int x = 2; 
		int y = 3;
		System.out.println(displayTwiceTheNumber(x,y));
		System.out.println(displayNumberPlusFive(x,y)); //println only returns one at a time 
		System.out.println(displayNumberSquared(x,y)); //println only returns one at a time 
		
	}
	public static int displayTwiceTheNumber( int x, int y)
	{
		int answer;
		answer = 2 * (x + y); 
		return answer; // because it's not void, you gotta return it.
	}
	public static int displayNumberPlusFive(int x, int y)
	{
		int answer;
		answer = 5 + (x +y);
		return answer; // because it's not void, you gotta return it.
	}
	public static int displayNumberSquared(int x, int y)
	{
		int answer;
		answer = (x+y) * (x+y);
		return answer; // because it's not void, you gotta return it. 
		
	}
}

//done in vscode
