public class Percentages {

    public static void computePercent(double x, double y) {
         
        
          double division = x / y;
         double percent= division*100;
          
       System.out.println( x +" is " + percent+ " percent of "+ y);
        
    }
    public static void main (String args[]) {
        // Write your code here

       
        computePercent(5.0, 2.0);


    
}
}
