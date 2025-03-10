package string_programs;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		String str= "I Love My Country";
		String reversed = reverseStringWordByWord(str);
		System.out.println(reversed.toString());
	}

	private static String reverseStringWordByWord(String str) {

		StringBuilder reversedString = new StringBuilder();
		StringBuilder currentString = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch==' ') {
				reversedString.insert(0, currentString).insert(0, ' ');
				currentString.setLength(0);
			}else {
				currentString.append(ch);
			}
		}
		 
		reversedString.insert(0, currentString);
		
		return reversedString.toString();
	}
}
