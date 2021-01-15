import java.util.Scanner;

public class GradeReport
{
   public static void main(String[] args)
   {
      int grade;
      int category;
      String teacherfeedback = "";
 
      Scanner in = new Scanner(System.in);
 
      System.out.print("enter your grade numerically: ");
      grade = in.nextInt();
      if(grade>100 || grade<=0) {
     System.out.println("error, impossible. the number must be between 0 and 100.");
     return;
      }
      category = grade/10;
      switch ( category )
      {
         case 10:    teacherfeedback = " perfect score, you've done your job well ";  break;

         case 9:     teacherfeedback = "well above average. excellent.";  break;

         case 8:     teacherfeedback = "Above Average. Nice Job.";  break;

         case 7:     teacherfeedback = "average";  break;

         case 6:     teacherfeedback = " below average you should see the professor...to clarify the material presented in class...";  break;

         case 5:     teacherfeedback = "below average you should see the professor...to clarify the material presented in class...`";  break;
         
         case 4:     teacherfeedback = "below average you should see the professor...to clarify the material presented in class...";  break;

         case 3:     teacherfeedback = "below average you should see the professor...to clarify the material presented in class...";  break;
         
         case 2:     teacherfeedback = "below average you should see the professor...to clarify the material presented in class...";  break;
         
         case 1:     teacherfeedback = "below average you should see the professor...to clarify the material presented in class...";  break;
         
         case 0:     teacherfeedback = "below average you should see the professor...to clarify the material presented in class...";  break;
         
     
      }

       System.out.println(teacherfeedback);
   }
}