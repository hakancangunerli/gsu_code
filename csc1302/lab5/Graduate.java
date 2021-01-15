// Hakan Gunerli Lab 5 #002504797
public class Graduate extends Student
{
   private String degree; 
   private String concentration;
   private int years;
   
   public Graduate (String major, double gradepointaverage, int creditHours, String degree, String concentration, int years) 
   {
      super(major,gradepointaverage,creditHours);
      this.degree = degree;
      this.concentration = concentration;
      this.years = years;
   }
   public int getYears()
   {
      return years;
   }
   public String getConcentration()
   {
      return concentration;
   }
}