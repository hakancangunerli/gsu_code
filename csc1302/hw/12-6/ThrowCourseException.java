public class ThrowCourseException {
    public static void main(String[] args) {
        Course[] courses = new Course[7];
        String[] courseDeparments = {"CSC", "BIO", "CHEM", "ECU", "Math", "Math", "ENGL"};
        int[] courseNumbers = {100, 200, 300, 400, 500, 600, 700};
      double[] courseCredits ={1.0, 2.0, 3.0, 4.0, 5.0, 60, 70};
int x;
for (x=0; x< courses.length; ++x){
    courses[x]= new Course();
}
for (x=0; x<courses.length; ++x){
    try{
        courses[x] = new Course(courseDeparments[x], courseNumbers[x], courseCredits[x]);
    }
 catch(CourseException e)
         {
            System.out.println("Course " + x + "  Error: " + e.getMessage());
         }

}
System.out.println("\nCourse values");
      for(x = 0; x < courses.length; ++x)
         System.out.println(courses[x].toString());

    }
}
