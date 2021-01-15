class InchesToFeet {
    public static void main(String[] args) {
     
        int inches =86; // constant given 
final int feetconstant= 12; //12 in= 1 ft 

        int inchesinfeet= inches / feetconstant; //this will give a rough estimate, next line will get the modulus
        int extrainches= inches % feetconstant;
        System.out.println("86 inches is "+ inchesinfeet + " feet and " + extrainches +" inches ");
    }
}


// similar logic to quartsgallons
//done in vscode, no copy
