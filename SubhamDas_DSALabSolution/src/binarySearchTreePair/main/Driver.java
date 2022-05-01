package binarySearchTreePair.main;

import java.util.HashSet;
import java.util.Scanner;
import binarySearchTreePair.classes.BSTCreation;
import binarySearchTreePair.classes.PairFinder;


public class Driver {
	
	public static void main(String[] args) {
		//Creating a new object of stack class
		Scanner sc = new Scanner(System.in);
		//Creating a new object of created class
		BSTCreation bst = new BSTCreation();
		//Creating a new object of created class
		PairFinder pf = new PairFinder();
		
		//Initialising variables
		int noOfNodes;
		BSTCreation.Node root = null;
		
		//Taking number of input nodes from the user
		System.out.println("Enter the number of nodes: ");
		noOfNodes = sc.nextInt();
		
		//Taking the node values from the user using loop
		System.out.println("Enter the number of node values: ");
		for(int i = 0; i < noOfNodes; i++) {
			root = bst.insert(root, sc.nextInt());
		}
		
		//Taking value of target sum
		System.out.println("Enter sum: ");
		int sum = sc.nextInt();
		
		//Creating an empty set to store BST node values
		HashSet<Integer> hset = new HashSet<Integer>();
		
		//Checking for sum pairs in the BST and displaying appropriate output
		if(!pf.sumPairFinder(root, sum, hset))
			System.out.println("Such pairs do not exist.");
		
		sc.close();
	}
}