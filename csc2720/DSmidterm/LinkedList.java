/* Gunerli, Hakan
I did not cheat during this assignment.  */

public class LinkedList{
    public static void main(String[] args) {
        LinkedList scratchLinkedList = new LinkedList(); // i'm using the constructor here. 
        scratchLinkedList.linkedAdd(6);// add values randomly assigned.  
        scratchLinkedList.linkedAdd(48);
        scratchLinkedList.linkedAdd(39);
        scratchLinkedList.linkedAdd(27);
        scratchLinkedList.linkedAdd(15);
        System.out.println("The list is: ");
        scratchLinkedList.linkedPrint(); // print the list. 
        scratchLinkedList.printHead();
        scratchLinkedList.deleteHead();
        System.out.print("list after deleted head: ");
        scratchLinkedList.linkedPrint();
        scratchLinkedList.printHead();
    }


    static class Node{ // constructor. 
        int data;
        Node next;
        public Node(int construct){
            data = construct;
            next = null;
        }
    }
    public Node head = null; // we are first starting with an empty one.
    // because where can it go? 

    public void linkedAdd(int n){
        Node temporary = new Node(n);
        temporary.next = head;
        head = temporary;
    }
// head code. 
    public void deleteHead(){

        int num,i;
        num =0; 
        i=0;         
        Node temporary = head;
        Node next = temporary.next.next; 
        temporary.next = next; // temporary once again refers to the adressor. 

        if(head == null){ // if the head is empty while you're trying to delete the head, return. 
            return;
        }
    
        if(num == 0){
            head = temporary.next; // if the value is zero, head will refer to the adressor of the temporary. 
            return;
        }
        while(temporary != null && i < num - 1){ // if it not null, 
            temporary = temporary.next; // temporary is will be the head, "deleting the node" 

            i += 1; // iterate until i is the same as number, 
                }
        if(temporary == null || temporary.next == null){ // if the temporary or the next(which is the adressor) is empty return the values. 
            return;
        }
        
    }

    public void printHead(){ // just print the heads. 
        System.out.println("The head is: " + head.data);
    }

    public void linkedPrint(){
        Node temp = head;
        while(temp != null){ // if it is not null, print the info 
            System.out.print(temp.data + " ");
            temp = temp.next; // then make sure the adressor refers to the next one and keep printing. 
        }
        System.out.println();
    }

    
 
}

/* time and space complexity:
time: Sums upto  O(n),  iterates through each element for the index, so it is a not an exponential.   
space: O(n), Linear complexity. the data access increases linear with the amount of nodes we got in the system */
