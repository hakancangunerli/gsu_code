class NumbersDemo {

    public static void main(String[] args, int x, int y) {
     
        displayNumberSquared(x,y);
        displayNumberPlusFive(x,y);
        displayTwiceTheNumber(x,y);

    
    }

    
public static void displayTwiceTheNumber(int x, int y ) {
    
      x = 5;
      y = -3;
        int answer1;
        int answer2;
        answer1 = 2 * (x); 
		answer2 = 2 * (y); 
    
    System.out.println(answer1);
    System.out.println(answer2);
}

public static void displayNumberSquared(int x, int y ) {
    x = 3;
    y = -4;
    int answer1;
    int answer2;
        answer1 =  x*x;
        answer2= y*y; 
    
  System.out.println(answer1);
  System.out.println(answer2);
}

public static void displayNumberPlusFive(int x, int y) {
    x = 24;

    y = -2;
    int answer1;
    int answer2;
        answer1 = 5 +x;
        answer2= 5+ y; 
  
  System.out.println(answer1);
  System.out.println(answer2);
}
}
//written in vscode in case it looks like copy and paste.

