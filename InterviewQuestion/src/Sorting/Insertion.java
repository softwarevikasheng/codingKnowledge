package Sorting;

public class Insertion {

	public static void main(String[] args) {
		 int arr[] = {10, 2, 4, 23, 45, 6, 78, 98, 45, 34};

	        for (int i = 1; i < arr.length; i++) {
	            int current = arr[i];
	            int j = i - 1;

	            // Shift elements greater than current
	            while (j >= 0 && arr[j] > current) {
	                arr[j + 1] = arr[j];
	                j--;
	            }

	            // Insert element at correct position
	            arr[j + 1] = current;
	        }

	}

}
