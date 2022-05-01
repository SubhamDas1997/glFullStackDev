package balancedBrackets.classes;

import java.util.Stack;

public class BalancedBrackets {
	
	public boolean areBracketsBalanced(String exp) {
		//Creating a new object of stack class
		Stack<Character> stack = new Stack<Character>();
		
		//Iterating through the input string
		for(int i = 0; i < exp.length(); i++) {
			//Storing character per iteration
			char ele = exp.charAt(i);
			
			//checking for opening brackets and pushing into stack
			if(ele == '(' || ele == '[' || ele == '{')
				stack.push(ele);
			
			//Checking if stack is empty
			if(stack.isEmpty()) {
				return false;
			}
			
			//Initialising a char variable for storing char at top of stack
			char check;
			
			//Checking char at top of stack for every closing bracket
			switch(ele) {
			case ')' :
				check = stack.pop();
				if(check != '(')
					//Returning false status if a different type of opening bracket found
					return false;
				break;
			
			case ']' :
				check = stack.pop();
				if(check != '[')
					//Returning false status if a different type of opening bracket found
					return false;
				break;
				
			case '}' :
				check = stack.pop();
				if(check != '{')
					//Returning false status if a different type of opening bracket found
					return false;
				break;
			}
		}
		//Returning empty stack status for empty input string
		return stack.isEmpty();
	}
}