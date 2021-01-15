import java.util.*;
public class initials {

    public static void main(String[] args) {
        String question;

        do{
            Scanner sc= new Scanner(System.in); 
            System.out.println();
            System.out.println("enter a name, with a space in the middle.");
            String userinput = sc.nextLine();
            int space = userinput.indexOf(' '); // find the space, 
            String firstName = userinput.substring(0, space);
            String lastName = userinput.substring(space+1);
            System.out.println("you entered the name: "+ userinput );
            System.out.println("hello, i have your first name as : " + firstName + " has "+ firstName.length() + " letters.");
            System.out.println("hello, i have your second name as: " + lastName +" has "+ lastName.length() + " letters.");
            System.out.println("did you know that your initials are" + Character.toUpperCase(firstName.charAt(0)) + Character.toUpperCase(lastName.charAt(0)));
            System.out.println("Do you wish to continue (Y)Yes or (N)No ?");
            question = sc.nextLine();
        }
        while(question.equalsIgnoreCase("Y")|| question.equalsIgnoreCase("yes") );
            
  










        
    }
    
}
