// Hakan Gunerli Assignment 2 Lab7 

import java.util.Stack;
// A user defined stack that supports getMin() in addition to push() and pop()
class MyStack
{
    Stack<Integer> stack = new Stack<Integer>(); //Creates a stack to keep track of all elements
    Stack<Integer> minStack = new Stack<Integer>(); //Dummy stack to store elements that are smaller than the others


// insert and removes first, 

 //Inserts element into the stack
 void push(int x){
    stack.push(x);
    if(minStack.size() != 0){
        if(x <= minStack.peek()){
            minStack.push(x);
        }
    }else{
        minStack.push(x);
    }
}

//Removes the top element from the stack if it is not empty
void pop(){
    if(!stack.isEmpty()){
        int i = stack.pop();
        if(i == minStack.peek()){
            minStack.pop();
        }
        System.out.println("The element that got popped: " + i);

        
    }else{
        System.out.println("stack does not have any value, it is empty.");
    }
}


// get min and peek

    //Prints minimum element of MyStack
    void getMin(){
        if(!stack.isEmpty()){
            System.out.println("minimum element : " + minStack.peek());
        }else{

            System.out.println("stack does not have any value, it is empty.");
            
        }
    }
    
    //Prints top element of the stack
    void peek(){
        if(!stack.isEmpty()){
        
            System.out.println("element at the top of the stack is: " + stack.peek());
        }else{
            System.out.println("stack does not have any value, it is empty.");
        }
    }
    

// Driver code 
    public static void main(String[] args) { 
        MyStack s = new MyStack(); // given
        s.push(3); // given
        s.push(5); // given
        s.getMin(); // given
        s.push(2); // given
        s.push(1); // given
        s.getMin(); // given
        s.pop(); // given
        s.getMin(); // given
        s.pop(); // given
        s.peek();// given
    }
}