package dsa;

import java.util.LinkedHashSet;
import java.util.Set;

public class duplicateArray {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,2,3,4,5,6,1,3,4,5};
		
		Set<Integer> obj = new LinkedHashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			int data = arr[i];
			obj.add(data);
		}
		
		for (Integer integer : obj) {
			System.out.println(integer);
		}
	}

}
