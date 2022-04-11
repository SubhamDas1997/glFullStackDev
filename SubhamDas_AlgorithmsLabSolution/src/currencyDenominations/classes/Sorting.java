package currencyDenominations.classes;

public class Sorting {
	
	public void descendingSort(int [] arr, int start, int end) {
		if(end - start < 2) {
			return;
		}
		
		//Initializing mid variable for finding middle element
		int mid = (start + end)/2;
		
		//Recursively calling the same method for each half of array
		descendingSort(arr,start,mid);
		descendingSort(arr,mid,end);
		//Calling method to merge the two parts into one sorted one
		merge(arr,start,mid,end);
	}

	public void merge(int[] arr, int start, int mid, int end) {
		//Initializing variables required for traversing
		int i = start;
		int j = mid;
		int k = 0;
		
		//Initializing temp array to store intermediate steps while sorting
		int[] temp = new int[end-start];
		
		while(i < mid && j < end) {
			//Checking whether elements are in descending order
			if(arr[i] >= arr[j]) {
				temp[k] = arr[i];
				i++;
				
			} else {
				temp[k] = arr[j];
				j++;
			}
			k++;
		}
		
		//Checking for corner cases
		while(i<mid) {
			temp[k] = arr[i];
			i++;
			k++;
		}
		
		//Checking for corner cases
		while(j<end) {
			temp[k] = arr[j];
			j++;
			k++;
		}
		
		//Moving all elements from temp array to the final sorted array
		for(int y = start,x = 0; x < temp.length; y++,x++) {
			arr[y] = temp[x];
		}
	}
}