class MileConversions {
    public static void main(String[] args) {
        // Write your code here
        float miles=4;   // float because the user expects a decimal      
        int INCHES_IN_MILE=63360; // 63360 inches in a mile 
        int FEET_IN_MILE=5280; //5280 ft in a mile
        int YARDS_IN_MILE=1760; // 1760 yds in a mile 

float  milesininches= miles * INCHES_IN_MILE;// decimal 63360*4
float milesinfeet= miles*FEET_IN_MILE;// decimal 5280*4
float milesinyard= miles * YARDS_IN_MILE;// decimal 1760*4

System.out.println(miles + " miles is "+  milesininches + " inches, or " + milesinfeet + " feet, or " + milesinyard + " yards"   );
    }

}


  //written in vscode in case it looks like copy and paste.


