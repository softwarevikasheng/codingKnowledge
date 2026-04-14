package simple;

public class largestValue {

	public static void main(String[] args) {

		int arr[] = {4,56,34,23,67,54,23,99,56,34,23,45,98};
		
		int lar = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (lar<arr[i]) {
				 lar = arr[i];
			}
		}
		System.out.println(lar);
		
	}

}
