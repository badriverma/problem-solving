package string_programs;

import java.util.HashSet;
import java.util.Set;

public class FindUniqueCharacterFromString {

	public static void main(String[] args) {
		
		String str= "badriprasadverma";
		
		System.out.println("Unique Characters are : ");
		printUniqueCharacters(str);
		
	}

	private static void printUniqueCharacters(String str) {
		Set<Character> set= new HashSet<Character>();
		for (Character character : str.toCharArray()) {
			if(!set.contains(character)) {
				System.out.print(character+" ");
				set.add(character);
			}
		}
	}
}
