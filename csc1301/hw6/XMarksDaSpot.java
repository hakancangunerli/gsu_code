/*
//////////////////////////////////////////////////////////////
// Solution to Programming homework #6 //
// Name: Hakan Can Gunerli //
// Lab time: Friday 3:30PM//
// Program description: //
//////////////////////////////////////////////////////////////
*/
public class XMarksDaSpot {

	public static void main(String[] args) {
		
		int size=10; // ten by ten 
		int x,y; 

		for( x=1; x<=(size)+1; x++)  // do this until number is less than 1 1
		{
			for( y=1; y<=(size)+1; y++)
			 {
				if( (x+y)==(size)+2  || x==y ) 
				{
					System.out.print("* "); 
				} else {
					System.out.print(". ");
				}
			}
			System.out.print("\n"); // fix the look, print next line 
		}
	}
}