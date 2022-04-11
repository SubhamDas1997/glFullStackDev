package currencyDenominations.classes;

public class PaymentApproach {

	public void denoCount(int[] arr, int amount) {
		//Creating a new object of created class
		Sorting sort = new Sorting();
		//Calling method to sort the array
		sort.descendingSort(arr, 0, arr.length);
		
		//Initializing a new array for counting each denomination
		int[] count = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			//Checking whether remaining amount is greater than denomination value
			if(amount >= arr[i]) {
				//Dividing remaining amount by denomination to get the count
				count[i] = amount/arr[i];
				//Subtracting denomination amount used from initial to get remaining
				amount -= (count[i] * arr[i]);
			}
		}
		
		//If remaining amount is not 0, printing amount cannot be paid with given denominations
		if (amount > 0) {
			System.out.println("Exact ammount cannot be fulfilled with the given highest denomination.");
		} else {
			//If remaining amount is 0, printing the denominations required with count of each
			System.out.println("Your payment approach in order to give min no of notes will be: ");
			for (int i = 0; i < arr.length; i++) {
				if (count[i] != 0)
					System.out.println(arr[i] + ":" + count[i]);
			}
		}
	}
}