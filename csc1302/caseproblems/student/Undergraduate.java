// Hakan Gunerli Lab 5 #002504797

public class Undergraduate extends Student
{
   private Boolean honors;
   
   public Undergraduate (String major, double gradepointaverage, int creditHours, Boolean honors) 
   {
      super(major,gradepointaverage,creditHours);
      this.honors = honors;
   }
   public boolean isHonor()
   {
      return honors;
   }

}
