package binarySearchTreePair.classes;

public class BSTCreation {
	
	//Creating basic BST Node
	public static class Node{
		int key;
		Node left, right;
	}
	
	//Creating a new node
	static Node newNode(int data) {
		Node temp = new Node();
		temp.key = data;
		temp.left = null;
		temp.right = null;
		
		return temp;
	}
	
	//Method to insert nodes in BST
	public Node insert(Node root, int key) {
		//Base condition, if root is null, create a new node and return it
		if(root == null)
			return newNode(key);
		
		//If key is less than root node, consider to left subtree
		if(key < root.key)
			root.left = insert(root.left,key);
		//If key is more than root node, consider to right subtree
		else
			root.right = insert(root.right,key);
		
		//Return the node value
		return root;
	}
}