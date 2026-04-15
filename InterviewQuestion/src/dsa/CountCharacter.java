package dsa;

import java.util.HashMap;

public class CountCharacter {

	public static void main(String[] args) {
		String name ="vikashKumar";
		HashMap<Character, Integer> obj = new HashMap<Character, Integer>();
		for (int i = 0; i < name.length(); i++) {
			char data = Character.toLowerCase(name.charAt(i));
			if (obj.containsKey(data)) {
				obj.put(data, obj.get(data)+1);
			} else {
				obj.put(data, 1);
			}
			
			
			
		}
		for (Character string : obj.keySet()) {
			System.out.println(string+ "="+obj.get(string));
		}
	}

}
