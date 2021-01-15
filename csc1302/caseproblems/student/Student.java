// Hakan Gunerli Lab 5 #002504797


public class Student
{
   private String major; 
   private double gradepointaverage ;
   private int creditHours;
   
   public Student (String major, double gradepointaverage, int creditHours) 
   {
      this.major = major;
      this.gradepointaverage = gradepointaverage;
      this.creditHours = creditHours;
   }
   public double getgradepointaverage()
   {
      return gradepointaverage; 
   }
   public String getMajor()
   {
      return major;
   }
   public String getYear()
   {
      if(creditHours < 32)
         return "Freshman";
      else if(creditHours >= 32 && creditHours < 64)
         return "Sophomore";
      else if (creditHours >= 64 && creditHours < 96)
         return "Juniors";
      else 
         return "Senior";
   }   
}
