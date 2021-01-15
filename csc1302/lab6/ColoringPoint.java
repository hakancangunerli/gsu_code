/**
 * Hakan Can Gunerli
 */

public class ColoringPoint extends Point implements Coloring {
private String color;
private Point pt;
ColoringPoint(){
    this.pt = new Point();
    this.color = "";

}
ColoringPoint( int x, int y, String color){

this.pt = new Point(x,y);
this.color = color;


}
ColoringPoint( Point pt, String color){

    this.pt = pt;
    this.color = color;


}

public String getColor() {
    return this.color;
}


public int getX() {
    // TODO Auto-generated method stub
    return pt.getX();
}

public int getY() {
    // TODO Auto-generated method stub
    return pt.getY();
}


public void setColor(String colore) {
    this.color = colore;
}


public void setLocation(int x, int y) {
    // TODO Auto-generated method stub
    this.pt.setLocation(x, y);
}


public boolean equals(ColoringPoint cP) {
    // TODO Auto-generated method stub

if (cP == this){
    return true;
}else{
    return false; 
}

}


public String toString() {
    // TODO Auto-generated method stub
    return this.pt.toString() + ", color " + this.color;

}
    
}