
import java.util.*;
public class FirstNameLastName {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println();
        System.out.println("Please enter your first name and last name, separated by a space.");
        String userinput = sc.nextLine();
        int space = userinput.indexOf(' ');
        String firstName = userinput.substring(0, space);
        String lastName = userinput.substring(space+1);
        System.out.println("you entered the name: "+ userinput );
        System.out.println("Your first name" + firstName + ":has "+ firstName.length() + " characters.");
        System.out.println("Your last name is" + lastName +":has "+ lastName.length() + " characters.");
        System.out.println("Your initials are " +firstName.charAt(0) + lastName.charAt(0));
        
    }

}
