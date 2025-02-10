package string_programs;

import java.util.Stack;

public class RemoveDigitFromString {

	public static void main(String[] args) {
		System.out.println(removeDigits("abc"));   // Output: "abc"
        System.out.println(removeDigits("cb34"));  // Output: ""
        System.out.println(removeDigits("a1b2c3")); // Output: ""
        System.out.println(removeDigits("a1b2c"));  // Output: "c"
	}

	private static String removeDigits(String string) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for (char ch : string.toCharArray()) {
			if(Character.isDigit(ch)) {
				if(!stack.empty() && !Character.isDigit(stack.peek())) {
					stack.pop();
				}
			}else {
				stack.push(ch);
			}
		}
		
		StringBuilder result = new StringBuilder();
		for (char character : stack) {
			result.append(character);
		}
		
		return result.toString();
	}
}
