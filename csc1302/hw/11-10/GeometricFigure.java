public abstract class GeometricFigure
{
    protected int height;
    protected int width;
    protected String figure;
    public GeometricFigure(int h, int w, String f)
    {
        height = h;
        width = w;
        figure = f;
        // write your code here
    }
    public int getHeight()
    {
       return height;
        // write your code here
    }
    public int getWidth()
    {
        return width;
        // write your code here
    }
    public String getFigure()
    {
        return figure;
        // write your code here
    }

    public abstract double figureArea(int h, int w);
}
