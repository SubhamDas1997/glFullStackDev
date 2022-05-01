package binarySearchTreePair.classes;

import java.util.HashSet;

public class PairFinder {
	
	//Method to find a pair in BST with the target sum
	public boolean sumPairFinder(BSTCreation.Node root, int sum, HashSet<Integer> set) {
		//Base condition for recursion
		if(root == null)
			return false;
		
		//Return true is pair is found in left subtree
		if(sumPairFinder(root.left,sum,set))
			return true;
		//if a pair can be constructed with the current node, print the pair and return true
		if(set.contains(sum - root.key)) {
			System.out.println("One such pair is (" + (sum - root.key) + ", " + root.key + ")");
			return true;
		}
		else
			// insert the current node's value into the set
			set.add(root.key);
		
		//Search in the right subtree if pair is not found in left subtree
		return sumPairFinder(root.right, sum, set);
	}
}