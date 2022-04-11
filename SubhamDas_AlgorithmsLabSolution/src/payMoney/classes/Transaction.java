package payMoney.classes;

public class Transaction {
	
	public void transactionCounter(int[] arr, int target) {
		//Initializing sum variable to add up and store the values
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			//Adding values to sum one by one
			sum += arr[i];
			//Comparing sum and target to see if the target is met
			if(sum >= target) {
				System.out.println("Target achieved after " + (i+1) + " transaction(s).");
				System.out.println();
				break;
			}
		}
		//Target is not achieved if sum is still less than target
		if(sum < target) {
			System.out.println("Given target is not achieved.");
		}
	}
}