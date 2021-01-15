
class NumbersDemo {

    public static void main(String[] args) {
     
        int x=5;
        int y=7;
        displayNumberSquared(x,y);
        displayNumberPlusFive(x,y);
        displayTwiceTheNumber(x,y);

    
    }

    public static void displayNumberSquared(int x, int y) {
        System.out.println( x*x);
        System.out.println( y*y);

    }
    public static void displayNumberPlusFive(int x, int y) {
        System.out.println( x+5);
        System.out.println( y+5);
    }
    public static void displayTwiceTheNumber(int x, int y) {
        System.out.println( x*2);
        System.out.println( y*2);
    }
}