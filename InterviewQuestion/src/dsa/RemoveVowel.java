package dsa;

public class RemoveVowel {

	public static void main(String[] args) {

		String str ="hello ji kasa ho";
		String result ="";
		for (int i = 0; i < str.length(); i++) {
			char data = str.charAt(i);
			
			if ("aeiouAEIOU".indexOf(data) == -1) {
				result = result + data;
			}
		}
		System.out.println(result);
	}

}
