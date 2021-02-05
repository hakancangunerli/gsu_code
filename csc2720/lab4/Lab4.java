// Hakan John Gunerli 
import java.util.Scanner; // this was missing. 
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;



public class Lab4 {
public static void main (String[] args){
    Scanner sc = new Scanner(System.in); //Declared a scanner
    System.out.println("Enter a string"); //Asking the user to enter the string to be checked
    String s1 = sc.nextLine(); //The given test string
    boolean ans = checkPalindrome(s1); //The method to check for pallindrome
    System.out.println(ans); // Should be True, if it is a pallindrome. 
}
public static boolean checkPalindrome(String s1){ 

 
    //	INSERT YOUR CODE HERE
    Stack<Character> s = new Stack<Character>();  // stack is top to buttom, 
    Queue<Character> q = new LinkedList<Character>();  // queue is from front to back. 
    
    
    for(int i = 0; i < s1.length(); i++){ 
        s.push(s1.charAt(i)); 
        q.add(s1.charAt(i)); 


    }
    
    String stack_reversed = ""; // i'll use this to add the contents of the stack. 
    while(!(s.isEmpty())){ // do the action unless it's empty. if it's empty can you even compare? 
        stack_reversed += s.pop(); 
    // Example of stack	push	s.push("r")
    // Example of	stack	pop	s.pop()

 
    }

    String queue_reversed = ""; // i'll use this to add the contents of the queue. 
    while(!(q.isEmpty())){
        queue_reversed += q.poll();
   // Example of	queue enqeue	q.add("r")
    //	Example of queue dequeue	q.poll()


    }
    
    boolean stack_pall = (s1.toLowerCase()).equals(stack_reversed.toLowerCase()); // this will compare the reversed stack with s1 input. 
    boolean queue_pall = (s1.toLowerCase()).equals(queue_reversed.toLowerCase()); // this will compare the reversed queue with input. 
    return ( stack_pall && queue_pall ); // return the result by just comparing. , i think .equals() would work too, but i like this one more :)
    }
}