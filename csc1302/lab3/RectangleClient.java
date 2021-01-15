// Hakan Can Gunerli CSC2520
public class RectangleClient {
	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		
		rect1.setFields(9, 4, 3, 12);
		rect2.setFields(2, 13, 14, 5);   // the example rectangle represented here, 
		
		System.out.println(  rect1.toString());
		System.out.println(  rect2.toString());
	}

}