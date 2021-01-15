import java.util.Scanner;
class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        System.out.print("how many quarts? "); //asks user input
        Scanner QuartsToGallonsInteractive = new Scanner(System.in); // declare scanner 
        int quartsNeeded = QuartsToGallonsInteractive.nextInt();

        int QUARTS_IN_GALLON=4; // 4 qt= 1gal 
        int gallonsNeeded; 
        int extraQuartsNeeded;
        gallonsNeeded= quartsNeeded / QUARTS_IN_GALLON; //this will give a rough estimate, next line will get the modulus
    extraQuartsNeeded= quartsNeeded % QUARTS_IN_GALLON; //modulus 
        System.out.println("A job that needs "+ quartsNeeded + " quarts requires "+ gallonsNeeded + " gallons plus " + extraQuartsNeeded + " quarts");

    
    }
}
//written in vscode in case it looks like copy and paste.
