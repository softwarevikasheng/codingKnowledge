//package dsa;
//
//import java.util.Set;
//
//public class Duplication {
//
//	public static void main(String[] args) {
//		String name = "vikashKumar";
//		String result ="";
//		for (int i = 0; i < name.length(); i++) {
//			char data = name.charAt(i);
//			if(result.indexOf(data)== -1) {
//				result = result +data;
//			}
//			
//		}
//		System.out.println(result);
//	}
//
//}




package dsa;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplication {

	public static void main(String[] args) {
		 String name = "vikashKumar";
	        String result = "";

	        Set<Character> set = new LinkedHashSet<>();

	        for (char ch : name.toCharArray()) {
	         
	                set.add(ch);
	                
	            
	        }
	        for (Character character : set) {
			 result+=	character ;
			}

	        System.out.println(result);
	}

}