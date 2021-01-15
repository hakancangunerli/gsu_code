public class Course {
    String department;
    int courseNumber;
    double credits;
    final int DEPT_LENGTH = 3;
    final int LOW_NUM = 100;
    final int HIGH_NUM = 499;
    final double LOW_CREDITS = 0.5;
    final double HIGH_CREDITS = 6;
    public Course() {
        department= "";
        courseNumber=0;
        credits=0.0; 
    }
    public Course(String dept, int num, double creditValue) throws CourseException {
        boolean isBad = false; 
        String msg= "";
        department = dept;
        courseNumber= num; 
        credits = creditValue;
        if (dept.length() != DEPT_LENGTH){
            msg += "\nThe Course code number must be 3 numerals ";
        }
        if(num< LOW_NUM || num > HIGH_NUM){
            msg += "\nThe Course number must be between 100 and 499 ";
        }
        if(creditValue < LOW_CREDITS || creditValue > HIGH_CREDITS){
            msg += "\nThe Course Credits 0.5 and 6 ";
        }
        if (!msg.equals("")){
           throw(new CourseException(msg + "\n   " + department + courseNumber +"  Credits " + credits)); 
        }


    }
    public String toString() {
    return  department + courseNumber + "  Credits " + credits;

    }
}
