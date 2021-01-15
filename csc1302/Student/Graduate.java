public class Graduate extends Student
{
   private String degree; 
   private String concentration;
   private int years;
   
   public Graduate (String major, double gpa, int creditHours, String degree, String concentration, int years) 
   {
      super(major,gpa,creditHours);
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