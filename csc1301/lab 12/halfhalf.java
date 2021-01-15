import java.util.*;

public class halfhalf {

  public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      System.out.print("give me a string: ");
      String stringRead= sc.nextLine();
    String firsthalf = stringRead.substring(0, stringRead.length()/2);
    String secondhalf = stringRead.substring(stringRead.length()/2);
    System.out.println("The result is " + firsthalf.toLowerCase() + secondhalf.toUpperCase());

  }
}