package string_programs;

public class StringPalindromeTypeTwo {

	public static void main(String[] args) {
		String str = "racecar";
		
		boolean palindrome = isStringPalindrome(str);
		System.out.println("Is Palindrome : "+palindrome);
	}

	private static boolean isStringPalindrome(String str) {
		int left = 0;
		int right = str.length()-1;
		
		while(left<right) {
			
			if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}
}
