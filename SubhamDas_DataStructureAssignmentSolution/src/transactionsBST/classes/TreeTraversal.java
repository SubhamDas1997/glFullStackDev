package transactionsBST.classes;

public class TreeTraversal {
	
	//Method to traverse the created tree
	public void rightSkewedTreeTraversal(Node root) {
		//base condition for recursion
		if (root == null) {
			return;
		}
		//Printing node values
		System.out.print(root.key + " ");
		//Checking only the right nodes as its a right skewed tree
		rightSkewedTreeTraversal(root.right);
	}
}