public class Square extends GeometricFigure
{
    private double area;
    public Square(int w, int h, String f)
    {
        
      super(w, h, f); 
        // write your code here
    }

    public double figureArea(int w, int h)
    {
     area = (double) (w*h);
     return area; 
        // write your code here
    }
}
