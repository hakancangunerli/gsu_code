import java.util.*;

class BinarySearchTree {
    public static void main(String[] args) 
	{ 
		BinarySearchTree tree = new BinarySearchTree(); 
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the k value: ");
		int k_val = sc.nextInt();

		tree.insert(20); // i changed the order from smallest to biggest. 
        tree.insert(30); 
		tree.insert(40); 
        tree.insert(50); 
		tree.insert(60); 
        tree.insert(70); 
		tree.insert(80); 
		tree.kthLargest(k_val);		
	} 


	BinarySearchTree() 
	{ 
		root = null; 
	} 
	
    public class count { 
		int c = 0; 
	} 

	public void insert(int data) 
	{ 
		this.root = this.insertRec(this.root, data); 
	} 
	
	private Node insertRec(Node node, int data) 
	{ 


if (node == null)
        { 
			this.root = new Node(data); 
return this.root; 
		} 
if (data == node.data)
        { 
return node; 
		}
else if(data < node.data)
        { 
			node.left = this.insertRec(node.left, data); 
		} 
else 
        { 
	node.right = this.insertRec(node.right, data); 
		} 
return node; 
	}				

    void kthLargest(int k) 
	{ 
		count c = new count();
	
        this.kthLargestUtil(this.root, k, c); 
	} 

    void kthLargestUtil(Node node, int k, count C) 
	{ 
		
		if (node == null || C.c >= k) 
			return; 

            // Write code here. 
		this.kthLargestUtil(node.right, k, C); 
		C.c++; 
		if (C.c == k) { 
			if(k == 1)
            {
				System.out.print("order: " + k + "st, value: " + node.data);
				return;
			}
            else if(k == 3)
            {
                System.out.print("order: " + k + "rd, value: " + node.data);
			}
            else if(k == 2)
            {
				System.out.print("order: " + k + "nd, value: " + node.data);
				return;
            }
            else
            {
				System.out.print("order: " + k + " value: " + node.data);
				return; 
			}
		} 
		this.kthLargestUtil(node.left, k, C); 
	} 
	

    class Node { 
        int data; 
        Node left, right; 
        Node(int d) 
        { 
            data = d; 
            left = right = null; 
        } 
    } 
    Node root; 
	
}