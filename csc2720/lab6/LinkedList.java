/* Hakan Gunerli Lab6 DS */ 


public class LinkedList { 

	static Node head; 

	static class Node { 

		int data; 
		Node next; 

		Node(int d) //Node Constructor
		{ 
			data = d; 
			next = null; 
		} 
	} 

	/* Function to reverse the linked list */
	Node reverse(Node node) 
	{ 
		//Write Your Code Here
        Node current = node;
        Node previous_iteration = null;
        
        do{Node next_iteration = current.next;  // we have three stuff here, current-present-next you stor enext , change next with current and move one step forward. 
            current.next = previous_iteration;
            previous_iteration = current;
            current = next_iteration;  
        }while(current != null); // until we get an empty node, we'll keep transversing it, sequencial access it v importtant here. 
        
        return previous_iteration;
	} 

	// prints content of double linked list 
	void printList(Node node) 
	{ 
		//Write Your Code Here
        Node second_node = node; 
		while (second_node != null) 
		{ 
			System.out.print(" "+ second_node.data);  // i like to print like this personally, 
			second_node = second_node.next; // not to be confused with Node(2). 
		}
	} 

	public static void main(String[] args) 
	{ 
		LinkedList list = new LinkedList();  
		list.head = new Node(1); 
		list.head.next = new Node(2);  
		list.head.next.next = new Node(3); 
		list.head.next.next.next = new Node(4); 

		System.out.println("Given Linked list"); 
		list.printList(head); 
		head = list.reverse(head); 
		System.out.println(""); 
		System.out.println("Reversed linked list "); 
		//Write Your Code to print the linked list Here. 
        list.printList(head); // check printlist method 
	} 
}