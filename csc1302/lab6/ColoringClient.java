/**
 * Hakan Can Gunerli
 */

public class ColoringClient {
    

public static void main(String[] args) {
    ColoringPoint cP1, cP2;
    cP1 = new ColoringPoint(5,10, "Blue");
    cP2 = new ColoringPoint(25,15, "Orange");
    
    System.out.println("cp1 is " +cP1);
     
    System.out.println( "cp2 is "  + cP2);
    
   
   
    System.out.println( "are they the same? "+ cP1.equals(cP2));
   

}







}
