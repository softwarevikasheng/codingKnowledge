package Sorting;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {

		int arr[] = {10,2,4,23,45,6,78,98,45,34};

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int tem = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tem;
				}
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}

}
