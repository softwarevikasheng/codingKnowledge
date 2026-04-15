package dsa;

import java.util.HashMap;

public class CountingData {

	public static void main(String[] args) {
		int arr[]= {1,1,2,3,4,3,2,1,2,3,4,3,8};
		
		HashMap<Integer, Integer> obj = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int data = arr[i];
			if (obj.containsKey(arr[i])) {
				obj.put(data,obj.get(data)+1);
			} else {
				obj.put(data, 1);
			}
		}
		
		for (Integer i : obj.keySet()) {
			System.out.println(i +"="+ obj.get(i));
		}
		
		
	}

}
