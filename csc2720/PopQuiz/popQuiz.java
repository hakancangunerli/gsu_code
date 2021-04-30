// Hakan Can Gunerli
// did not need ArrayList for this. 

public class popQuiz{
    public static void main(String[] args){
        
        System.out.println("Pop Quiz Programming");
        Node head = new Node(1); 
        head.next=new Node(2);         
        head.next.next=new Node(3); 
        head.next.next.next=new Node(1); 
        head.next.next.next.next=new Node(2);
        head = getUnique(head); 
        printLinkedList(head); // given

    }

    public static Node getUnique(Node head)
    { 
        Node temp1 = head;
        Node temp2 = null;

        while(temp1 != null && temp1.next != null) { temp2 = temp1; 

            while(temp2 != null && temp2.next != null)
            {
                int aytim = temp1.item; // number check, move node accordingly. 
                int nexitem = temp2.next.item; // cannot be null so it needs to be here.
                
                if(aytim == nexitem ) // if they match, switch. 
                { 
                    temp2.next = temp2.next.next; 
                }
                else
                {
                    temp2 = temp2.next; 
                }
            }
            
            temp1 = temp1.next; 
        }
        return head;
    }

    public static void printLinkedList(Node head)
    { 
        for(Node cur = head; cur != null; cur = cur.next)
        { 
            if(cur.next == null)
            {
                System.out.print(cur.item); 
            }
            else
            {
                System.out.print(cur.item + "->"); // i just want to add the -> sign
            }
        }
    }
}

class Node{  // im not gonna make it a separate file. 
    int item;
    Node next;

    Node(int d){ 
        item = d;
        next = null;
    }
}