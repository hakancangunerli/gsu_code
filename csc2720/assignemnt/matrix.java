
// Gunerli, Hakan
/* description: this program is for calculating two dot products of square matrices.
ask user for dimension. ☑ 
the user inputs dimensions of the array, must be 50. force them to make it fifty. ☑ 
generate random matrices. ☑  
display matrices and multiply them, display result ☑ 
 also represent the time it takes for you to do that. ☑ 
 prompt to repeat. ☑ 
*/
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class matrix{
    public static void main(String[] args) {     // we are not told to methodify our matrix, so i'll just do it in the main. 
         // primitive declarations, non-primitives are at line 38. 
        Scanner scan = new Scanner(System.in); 
        Random RAND = new Random();  
         long timer_start=  System.nanoTime(); 
        int dimension; 
        String user_response; 
       
do {  // goto doesn't exist in java, so i've to do a do-while here.  
    
     

 //asking user inputs
    System.out.print("dimension of your matrix, please put 50 otherwise you can't continue:");
    dimension = scan.nextInt();
    while(dimension != 50){//Keep prompting the user till the desired number is entered.
     System.out.println("nice try. it's fifty.  ");
     System.out.print("__,_____\n" + "/ __.==--\" \n"+ "/#(-'\n" +"`-'" );
     System.out.println("\n put fifty.");
     
 
     dimension = scan.nextInt();
 }
 
     //non-primitive declarations, matrices are essentially multi-dim arrays. 
     int matris_un[][] = new int[dimension][dimension];
     int matris_deux[][]= new int[dimension][dimension]; 
 
 // iterate and add values to the arrays here, 
for (int i = 0; i < dimension; i++) {
 for (int k = 0; k < dimension; k++) {
     matris_deux[i][k] = RAND.nextInt(50);
     matris_un[i][k] = RAND.nextInt(50); // it needs to be 50 here, not dimension cause otherwise the value will CHANGE for each iteration.
 }
}    
// we need the multi-dimensional array print here, since it's multi-dimensional we can't do 
/*
for (int element: array) {
         System.out.println(element);
     }
     THIS WILL NOT WORK. 
*/

System.out.println("The result matrix is as follows: ");
int dot_product_result[][] = new int[dimension][dimension]; //Initialized the resultant matrix

for(int i = 0; i < dimension; i++){
    for(int j = 0; j < dimension; j++){
        for(int k = 0; k < dimension; k++){
            dot_product_result[i][j] += matris_un[i][k]*matris_deux[k][j];
        }
    }
}

// print our iterated matrices
System.out.println(Arrays.deepToString(matris_deux));
System.out.println(Arrays.deepToString(matris_un));// toString is for 1D arrays. deepToString for multi. 
System.out.println(Arrays.deepToString(dot_product_result));

// print time taken. 
long timer_stop = System.nanoTime();
System.out.print("here is the time it took for all that, in milliseconds: ") ;
System.out.print((timer_stop - timer_start)/ 1000000 ); 
System.out.println();



// to check if user wants to try again.
System.out.println("ok... you done?");
System.out.println("do you wanna do this again?, type y for yes: ");
user_response = scan.next(); 

  


} while (user_response.equals("y")); 
// do the action until the user_response returns something else other than y. 
    scan.close();


} //main bracket 
}// class bracket, i can't tell which one it is sometimes lol 
