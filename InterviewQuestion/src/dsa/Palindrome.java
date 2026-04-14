package dsa;

public class Palindrome {

	public static void main(String[] args) {

		String name = "madam";
		String rev ="";
		for (int i = name.length()-1; i >= 0; i--) {
			char data = name.charAt(i);
			rev = rev + data;
		}
		if (rev.equals(name)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
