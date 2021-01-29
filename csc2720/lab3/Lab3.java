import java.util.*;
public class Lab3 {
public static void main (String[] args){ String
s1 = "DataStructuresIssss###Fun"; String // we are given.
s2 = "DataStructuresIszwp###Fun"; boolean // we are given. 
ans = backspaceCompare(s1,s2); // we are given
System.out.println(ans); // Should be True, it is! 
}
public static boolean backspaceCompare(String s1, String s2){
    Stack<Character> s1_stack = new Stack<Character>(); // we are given 

    Stack<Character> s2_stack = new Stack<Character>();// we are given 

    // my code: 
// ill iterate the characters to the stack. nothing fancy, no methods. just repetitive actions.

int index = 0; // i'm doing the same action TWICE, so i'll just not create an extra variable for iteration. 

    for( index =0;index < s1.length(); index++){ // we are essentially unless it is # we will add the character to the stack.  
        char s1_character = s1.charAt(index);
        if(s1_character != '#'){ 

            s1_stack.push(s1_character); 

        }else if(!s1_stack.empty()){

            s1_stack.pop();  
        }
    }
    
    for( index = 0; index < s2.length(); index++){ // we are essentially unless it is # we will add the character to the stack, just like the one on the top. 
        char s2_character = s2.charAt(index); 
        if(s2_character != '#'){

            s2_stack.push(s2_character);

        }else if(!s2_stack.empty()){

            s2_stack.pop(); 
        }
    }

    String s1_stack_result = String.valueOf(s1_stack); 
    String s2_stack_result = String.valueOf(s2_stack); 
    return s1_stack_result.equals(s2_stack_result); 
} 
}