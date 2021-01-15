/*Hakan Can Gunerli, Lab8, CSC1302 */
 import java.util.ArrayList;
 
 import java.util.Collections;

  
 public class RectangleClient 
 {
   
 public static void main (String[]args) 
   {
     
 ArrayList <Rectangle> list1 = new ArrayList <Rectangle>();
     
  
 list1.add (new Rectangle (50, 2,  new Point (2, 5)));
     
 list1.add (new Rectangle (50, 10,  new Point (15, 25)));
     
 list1.add (new Rectangle (40, 01, new Point (30, 3)));
     
 list1.add (new Rectangle (35, 04, new Point (34, 5)));
     
 list1.add (new Rectangle (30, 06, new Point (12, 4)));
     
 list1.add (new Rectangle (25, 02, new Point (54, 8)));
     
 list1.add (new Rectangle (20, 20, new Point (80, 15)));
     
 list1.add (new Rectangle (15, 25, new Point (25, 12)));
     
 list1.add (new Rectangle (10, 35, new Point (85, 85)));
     
 list1.add (new Rectangle (5, 40, new Point (30, 30)));
     
  
 System.out.println ("prev constructed rectangles,  (h, w, p)");
     
 System.out.println (list1.toString ());
     
 System.out.println ();	// two empty spaces, 
     System.out.println ();
     
 Collections.sort (list1);	// sorting here, 
     System.out.println ("these are the rectangles after sorted ");
     
 System.out.println (list1.toString ());
 
  
  
 }


 }
 