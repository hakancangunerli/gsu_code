public class Undergraduate extends Student
{
   private Boolean honors;
   
   public Undergraduate (String major, double gpa, int creditHours, Boolean honors) 
   {
      super(major,gpa,creditHours);
      this.honors = honors;
   }
   public boolean isHonor()
   {
      return honors;
   }

}
