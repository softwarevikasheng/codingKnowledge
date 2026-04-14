package dsa;

import java.util.Arrays;

public class SwapingArray {

	public static void main(String[] args) {

		int arr[]= {1,3,4,5,6,7,80};
		
		int start = 0;
		int end =arr.length-1;
		
		while (start <end) {
			
			int tem = arr[start];
			arr[start] = arr[end];
			arr[end] = tem;
			
			start++;
			end--;
		}
		
		for (int i : arr) {
			System.out.print(i+ " ");
		}
	}

}
