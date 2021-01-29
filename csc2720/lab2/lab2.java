import java.util.Stack;

public class Lab2 {
public static void main (String[] args)
{

String str = "{}{{{{}}";
boolean ans = isBalanced(str);
System.out.println("Answer "+ ans); // Should be False

}

public static boolean isBalanced(String str){ 
    Stack<Character> stack = new Stack<Character>();

// Example of push	stack.push("{")

// Example of pop	stack.pop()
// Example of isEmpty	stack.isEmpty()


int i =0;  // standard counter variable . 

int string_length = str.length(); // the length of the string at line 7. 

// iterate through the string "str"
for (i=0; i<string_length; i++){
    char curly = str.charAt(i); // i'll check for each char i receive from the string index
    if (curly == '{'){ // if it has forward-facing curly bracket then i'll push, it should be BALANCED. 
        stack.push(curly);
    }
    else if(stack.isEmpty()){
        return false; // if it's empty then the str isn't balanced. 
    }
    else if(curly == '}'){
        stack.pop(); // if it's backwards-facing curly bracket, i'll pop so it'll remove it. 
    }
}

 return stack.isEmpty(); // if i took care of all the stuff in the stack, then the stack isn't balanced. 
    
}
}

