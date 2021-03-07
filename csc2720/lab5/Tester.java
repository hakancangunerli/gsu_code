/*
Hakan Gunerli Lab5 
*/


public class Tester{
    public static void main(String[] args){
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        second.next = third;
    
        /* The current linked list is as follows:
        head	second	third
        |	|	|
        |	|	|
        +----+------+	+----+------+	+----+------+
        | 1	|	o-------->| 2	|	o-------->|	3 | null |
        +----+------+	+----+------+	+----+------+ */
    
        System.out.println("List Before Deletion"); 
        printLinkedList(head); // Should be 1 2 3
    
        //	User wants to delete at index 2 
        deleteAtIndex(2, head); 
        System.out.println("List After Deletion at index 2");
        printLinkedList(head);	// Should be 1 2
    
        //	User wants to delete at index 1 
        deleteAtIndex(1, head); 
        System.out.println("List After Deletion at index 1");
    
        printLinkedList(head);	// Should be 2
    
    }
    
    //	To pass the linked list to a function, you only need to pass the head 
    public static void deleteAtIndex(int value, Node head){
        Node prev = head;  // node1 
        Node curr = head; // node 1 
        int counter = 0;// increment count as you traverse the list  


        // this is my code area right here
        while(curr != null){ // if node1 is not empty, 
            if(value == counter){ // counter equals the value we get from pubstat 
                prev.next = curr.next; 
                break;
            }
            prev = curr;  
            curr = curr.next;
            counter += 1; // increment the if here as we were told to do 
        }
    }
    public static void printLinkedList(Node head){
        // Node traversal and printing 
        for(Node cur = head;cur!=null;cur=cur.next){  // do the switch, transverse 
            System.out.print(cur.item+" "); 
    }
        System.out.println();
    }
    }