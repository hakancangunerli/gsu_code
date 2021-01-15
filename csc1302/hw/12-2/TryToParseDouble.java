import java.util.*;
public class TryToParseDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number; 

        try{
            System.out.print("give me a number ");
            number = Double.parseDouble(sc.nextLine());
        }catch (NumberFormatException exception) {
            number = 0; 
            System.out.println("Value entered cannot be converted to a floating-point number. ");

        }
System.out.println(number);








    }
}
