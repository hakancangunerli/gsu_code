import java.util.*;

public class lab12 {

  public static void main(String args[]) {
    halfhalf();
    cat();
    fancymyname();
  }


public static void halfhalf() {
          //half half 

    Scanner sc= new Scanner(System.in);
      System.out.print("give me a string: ");
      String stringRead= sc.nextLine();
    String firsthalf = stringRead.substring(0, stringRead.length()/2);
    String secondhalf = stringRead.substring(stringRead.length()/2);
    System.out.println("The result is " + firsthalf.toLowerCase() + secondhalf.toUpperCase());

}


// cat
public static void cat() {
    String cat= "cat";
    String reverse = new StringBuilder(cat).reverse().toString();
    System.out.println(cat);     
    System.out.println(reverse);

}    




public static void fancymyname() {
    // fancymyname 

    Scanner sc= new Scanner(System.in); 
    System.out.println();
    System.out.println("enter a name, with a space in the middle.");
    String userinput = sc.nextLine();
    int space = userinput.indexOf(' ');
    String firstName = userinput.substring(0, space);
    String lastName = userinput.substring(space+1);
    System.out.println("you entered the name: "+ userinput );
    System.out.println("first name: " + firstName + " has "+ firstName.length() + " letters.");
    System.out.println("last name: " + lastName +" has "+ lastName.length() + " letters.");
    System.out.println("Your initials are: " + Character.toUpperCase(firstName.charAt(0)) + Character.toUpperCase(lastName.charAt(0)));
    
    
}         
    }


