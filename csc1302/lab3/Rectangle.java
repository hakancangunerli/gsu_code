// Hakan Can Gunerli CSC2520
public class Rectangle {
	private int x_coor= 0 ;
	private int y_coor=0 ;
	private int w= 0 ;
	private int h = 0 ;
	
	
	public void setFields(int newx, int newy, int newwidth, int newheight) {
		x_coor= newx;
		y_coor= newy;
		w= newwidth;
		h= newheight;
		
	}
	
	public int getHeight() {
		return h;
	}
	public int getWidth() {
		return w;
	}
	public int getX() {
		return x_coor;
	}
	public int getY() {
		return y_coor;
	}
	public String toString() {
		return "Rectangle: [x = "+ x_coor +", y = "+ y_coor + ", width = "+ w + ", height = " + h + "], the area is " + w*h ;
	}

}