package chapter10_.caseproblems;

/**
 *
 * @author Gerardo A A
 */
public class LessonWithRental extends Rental{
    private Boolean lesson;
    public static final String[] instructor = {"Q1","Q2","Q3","Q4","Q5","Q6","A7","A8"};
    private Integer type;
    

    public LessonWithRental(String contact_number, Integer minutes,Integer equipment){
        super(contact_number, minutes);
        this.type = equipment;
        if(equipment==0 || equipment==1)
            this.lesson = true;
        else
            this.lesson=false;
        
    }

    public Integer getType() {
        return type;
    }
    
    

    public String getInstructor(){
        return "Instructor:"+type+"  equipment type:"+instructor[type]+" Lesson:"+lesson;
    }
    
    
}
