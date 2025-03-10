package string_programs;

public class StringPalindromeTypeOne {

	public static void main(String[] args) {
		String str="A man a plan a canal Panama";
		
		//Type 1
		str= str.replaceAll("\\s", "").toLowerCase();
		String palin =new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(palin)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}
}
