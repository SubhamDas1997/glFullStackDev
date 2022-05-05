package transactionsBST.main;

import transactionsBST.classes.Node;
import transactionsBST.classes.RightSkewedBSTCreation;
import transactionsBST.classes.TreeTraversal;

public class Driver {

	public static void main(String[] args) {
		//Creating a new object of created class
		RightSkewedBSTCreation rightBST = new RightSkewedBSTCreation();
		//Creating a new object of created class
		TreeTraversal treeTravel = new TreeTraversal();
		
		//Creating the BST node by node based on BST rules
		rightBST.node = new Node(50);
		rightBST.node.left = new Node(30);
		rightBST.node.right = new Node(60);
		rightBST.node.left.left = new Node(10);
		rightBST.node.right.left = new Node(55);
		
		//Converting the BST to right skewed tree
		rightBST.rightSkewedBST(rightBST.node);
		
		//Traversing the created right skewed tree by traversing each node
		System.out.println("Node values in ascending order: ");
		treeTravel.rightSkewedTreeTraversal(rightBST.rootNode);
	}
}