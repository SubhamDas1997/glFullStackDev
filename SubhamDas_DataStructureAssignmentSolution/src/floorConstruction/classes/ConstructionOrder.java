package floorConstruction.classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack; 

public class ConstructionOrder {
	
	public void orderOfConstruction(Integer[] arr) {
		//Creating a new object of stack class
		Stack <Integer> stack = new Stack <Integer> ();
		
		//Initialising variables and array
		int j = 0;
		int val = 0;
        Integer[] sortedFloorSizes = arr.clone();
        
        //Printing sortedFloorSizes array to check cloning operation
        //for (int i = 0; i < arr.length; i++)
        	//System.out.println(sortedFloorSizes[i]);
        
        //Sorting the input array in descending order
        Arrays.sort(sortedFloorSizes, Collections.reverseOrder());
        
        //Printing sortedFloorSizes array to check elements
        //for (int i = 0; i < sortedFloorSizes.length; i++)
        	//System.out.println(sortedFloorSizes[i]);
        
        //going through all elements of the input array
        for (int i = 0; i < arr.length; i++) {
            //Checking for the largest size among elements
        	if (arr[i] == sortedFloorSizes[j]) {
        		if (i == arr.length - 1) 
                	j = i; 
                else 
                	j = i + 1;
                
                //Printing the day number with appropriate assembly work
                System.out.println("Day: " + (i + 1));
                if (stack != null) {
                    //Printing the current floor size
                	System.out.print(arr[i] + " ");
                	while (!stack.isEmpty()) {
                		//Popping the element from the stack and assigning it to 'val'
                		val = stack.pop();
                		//Checking for smaller floor sizes
                		if (val >= sortedFloorSizes[i])
                            //Printing lower floor sizes on the same day
                        	System.out.print(val + " ");
                        else { 
                        	//Adding the element back to the stack
                        	stack.push(val);
                            j = j - stack.size();
                            break;
                        }
                    } 
                    System.out.println();
                } else
                	//If stack is empty, print the correct floor size
                    System.out.println(arr[i]);
            } else {
            	//Printing the day number with no assembly work
                System.out.println("Day: " + (i + 1));
                System.out.println();
                //Adding the element to the stack
                stack.push(arr[i]);
            }
        }
	}
}   