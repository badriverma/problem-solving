package string_programs;

public class RemoveOccurenceOfSubString {

	public static void main(String[] args) {

		String str = "daabcbaabcbc";
		String part = "abc";
		
		String occurence = removeOccurenceOfSubString(str,part);
		System.out.println(occurence);
	}

	private static String removeOccurenceOfSubString(String str, String part) {
		StringBuilder stringBuilder = new StringBuilder(str);
		while(stringBuilder.indexOf(part) != -1) {
			int index= stringBuilder.indexOf(part);
			stringBuilder.delete(index, index+part.length());
		}
		return stringBuilder.toString();
	}

}
