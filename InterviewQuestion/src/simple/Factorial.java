package simple;

public class Factorial {

	public static void main(String[] args) {
		int num = 1;
		int result =1;
		if (num ==0 || num ==1) {
			System.out.println("1");
			
		}
		else {
			for (int i = num; i >0; i--) {
				result = result *i;
			}
		}
		System.out.println(result);
	}

}
