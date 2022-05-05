package transactionsBST.classes;

//Creating basic BST Node
public class Node {
	
	int key;
    public Node left;
	public Node right;
	
	//Creating a new node
    public Node(int item){
        key = item;
        left = right = null;
    }
}