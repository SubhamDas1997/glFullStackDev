package transactionsBST.classes;

public class RightSkewedBSTCreation {
	
	//Creating nodes for tree creation
	public Node node;
	static Node prevNode = null;
	public Node rootNode = null;
	
	//Method to convert BST to right skewed tree
	public void rightSkewedBST(Node root) {
		//base condition for recursion
		if (root == null)
			return;
		
		//Recurse for the left side of the tree first
		rightSkewedBST(root.left);
		
		//Check if root node of the skewed tree is not defined
		Node rightNode = root.right;
		if (rootNode == null) {
			rootNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		
		//Recurse for the right subtrees
		rightSkewedBST(rightNode);
	}
}