package Sorting;

public class SelecationSort {

	public static void main(String[] args) {

		int arr[] = {10,2,4,23,45,6,78,98,45,34};
		
		for (int i = 0; i < arr.length-1; i++) {
			int small= i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[small]> arr[j]) {
					small = j;
				}
				
				int tem = arr[i];
				arr[i]=arr[small];
				arr[small]= tem;
			}
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println(arr[i]);
		}
	}

}
