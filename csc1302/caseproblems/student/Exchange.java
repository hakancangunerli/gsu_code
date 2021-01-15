// Hakan Gunerli Lab 5 #002504797
public class Exchange extends Undergraduate
{
   private String country; 
   private String years;
   
   public Exchange (String major, double gradepointaverage, int creditHours, Boolean honors, String country, String years) 
   {  
      super(major,gradepointaverage,creditHours,honors);
      this.country = country;
      this.years = years;
   }
   public String getYears()
   {
      return years;
   }
   public String getCountry()
   {
      return country;
   }
}