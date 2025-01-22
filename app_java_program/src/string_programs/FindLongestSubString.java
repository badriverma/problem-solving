package string_programs;

import java.util.HashSet;

public class FindLongestSubString {

	public static void main(String[] args) {
		String str = "abcabcbb";
		
		int findLength = findLongestSubStringLength(str);
		System.out.println("Length Of Longest Sub String : "+ findLength);
	}

	private static int findLongestSubStringLength(String str) {
		int maxLength = 0;
		int left = 0;
		HashSet<Character> set = new HashSet<Character>();
		
		for (int right = 0; right < str.length(); right++) {
			char currentChar = str.charAt(right);
			
			while(set.contains(currentChar)) {
				set.remove(str.charAt(left));
				left++;
			}
			set.add(currentChar);
			maxLength = Math.max(maxLength, right-left +1);
		}
		
		return maxLength;
	}
}
