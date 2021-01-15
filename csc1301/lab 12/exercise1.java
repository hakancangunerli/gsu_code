import java.util.*;

/*
Hakan Can Gunerli 
lab 12,
CSC1301- FR 3.30PM lab 
*/



/*
Write a statement that declares a String variable named city. Initialized it to
“San Francisco”.
b) Store its length in a variable called stringlen.
c) Store the first char in a variable called firstChar.
d) Store the uppercase version of the string in upperCity.
e) Store in lowerCity the lowercase version of the string.
f) Store just the first part of the String (i.e. “San”) in a variable called firstPart.
g) Print everything to the screen (one variable per line!)
*/
public class exercise1 {
public static void main(String[] args) {
    String city = "San Francisco"; //a 
    int stringlen= city.length(); // b
    char firstChar = city.charAt(0);  //c 
    String upperCity= city.toUpperCase(); //d 
    String lowerCity= city.toLowerCase(); //e 
    String firstPart=  city.substring(0,3);
    

            System.out.println(city); //print a 
            System.out.println(stringlen); // print b 
            System.out.println(firstChar);//print c
            System.out.println(upperCity); //print d 
            System.out.println(lowerCity); // print e     
            System.out.println(firstPart);// part f 


}
}