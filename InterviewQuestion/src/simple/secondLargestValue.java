package simple;

public class secondLargestValue {

	public static void main(String[] args) {

		int arr[]= {1,2,3,45,67,34,5,23,89,98,65,45,34,68,86,90};
		int first =arr[0];
		int second = arr[1];
		
		if (first<second) {
			int tem = first;
			first = second;
			second = tem;
		}
		
		
		for (int i = 2; i < arr.length; i++) {
				if (arr[i]> first) {
					second = first;
					first = arr[i];
					
				
			}
				else if(second<arr[i] && first !=arr[i]) {
					
					second = arr[i];
					
				}
				
		}
		System.out.println(first);
		System.out.println(second);
	}

}
