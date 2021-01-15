import java.util.*;
public class ConvertDate
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter date to be converted: ");
        String date= sc.nextLine();
    	String letters = date.trim().substring(0,1);
    	String remaining = date.trim().substring(1);
 		String month = letters.trim().toUpperCase() + remaining.trim().toLowerCase().trim().substring(0, date.trim().indexOf(" ")).trim();
    	String day = date.trim().trim().substring(date.trim().indexOf(" ") + 1, date.trim().lastIndexOf(",")).trim(); 
    	String year = date.trim().trim().substring(date.trim().lastIndexOf(",") + 1).trim(); 
    	System.out.println("Converted Date: " + day + " " + month + " " + year);
    }
}