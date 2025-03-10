package string_programs;

import java.util.stream.IntStream;

public class StringPalindromeTypeThree {
	
	public static void main(String[] args) {
		
		 String str = "Level";	
		 
		 boolean palindrome = isStringPalindrome(str);
		 System.out.println("Is Palindrome : "+palindrome);

	}

	private static boolean isStringPalindrome(String str) {
		
		return IntStream.range(0, str.length()/2)
		.allMatch(i -> Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(str.length()-i-1)));
		
	}
}
