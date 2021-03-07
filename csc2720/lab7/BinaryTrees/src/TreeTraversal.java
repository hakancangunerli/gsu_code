public class TreeTraversal{
	public static void main(String[] args){
		// Create a tree called tree1 
			BinaryTree<Character> tree1 = new BinaryTree('H');
			BinaryTree<Character> rightsubtree1 = new BinaryTree('X'); 
			BinaryTree<Character> leftsubtree1 = new BinaryTree('D'); 
			BinaryTree<Character> leftsubtree2 = new BinaryTree('F'); 

			rightsubtree1.attachRight('Y');
			leftsubtree1.attachLeft('B');
			leftsubtree2.attachRight('G'); 
			leftsubtree2.attachLeft('E');
	
			leftsubtree1.attachRightSubtree(leftsubtree2); 
			tree1.attachLeftSubtree(leftsubtree1);
			tree1.attachRightSubtree(rightsubtree1);

			BinaryTree<Character> tree2 = new BinaryTree('F'); // assigned random values.  
			BinaryTree<Character> right_sub_one_of_tree_number_2 = new BinaryTree('G');
			BinaryTree<Character> right_sub_two_of_tree_number_2 = new BinaryTree('I');
			BinaryTree<Character> left_sub_two_of_tree_number_2 = new BinaryTree('D');
			BinaryTree<Character> left_sub_one_of_tree_number_2 = new BinaryTree('B');

			right_sub_two_of_tree_number_2.attachLeft('H');
			left_sub_one_of_tree_number_2.attachLeft('A');		
			left_sub_two_of_tree_number_2.attachLeft('C');
			left_sub_two_of_tree_number_2.attachRight('E');
			
			right_sub_one_of_tree_number_2.attachRightSubtree(right_sub_two_of_tree_number_2);
			left_sub_one_of_tree_number_2.attachRightSubtree(left_sub_two_of_tree_number_2);
			tree2.attachLeftSubtree(left_sub_one_of_tree_number_2);
			tree2.attachRightSubtree(right_sub_one_of_tree_number_2);






			// 
			System.out.println(checkSkipped(tree1)); // Should return true
			System.out.println(checkSkipped(tree2)); // Should return false
			// 
		}
		
		public static boolean checkSkipped(BinaryTree<Character> tree){ 
			TreeIterator<Character> iterator = new TreeIterator<Character>(tree);
			iterator.setInorder();
			char curr;
			int ascii_value, previous; // conversion to ascii val. 
			previous = -13; // random number to make sure it is not a negative number. 
			while (iterator.hasNext()){
				curr = iterator.next(); // iterate the value 
				ascii_value = (int) curr; // holds the value of asciis. 
				if(previous != -13){ // 
					if(curr != previous + 1){
						return true;
					}
				}previous = curr;
		
			}
			return false; 
		}
}