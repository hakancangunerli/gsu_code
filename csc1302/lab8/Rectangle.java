/*Hakan Can Gunerli, Lab8, CSC1302 */

public class Rectangle implements Comparable < Rectangle >
{
  
private int width;
   
private int height;
   
private Point topCorner;
   

public Rectangle (int width, int height, Point topCorner)
  {				//constructing rectangle here, 
this.topCorner = topCorner;
    
this.width = width;
    
this.height = height;
  

} 
public Point getTopCorner ()
  {
    
return topCorner;
  
}
  
public int getWidth ()
  {
    
return width;
  
}
  
public int getHeight ()
  {
    
return height;
  
}
  
 
public void setWidth (int width)
  {
    
this.width = width;
  
} 
 
public void setHeight (int height)
  {
    
this.height = height;
  
} 
 
public void setTopCorner (Point topCorner)
  {
    
this.topCorner = topCorner;
  
} 
public String toString ()
  {
    
return "Width: " + width + " " + "Height: " + height + " " + topCorner;
  
}
  
 
public int compareTo (Rectangle rect)
  {
    
if (width == rect.width)
      
return height - rect.height;
    
    else if (height == rect.height)
      
return topCorner.compareTo (rect.topCorner);
    
    else
      
return width - rect.width;
  
 
 
}

}


 
