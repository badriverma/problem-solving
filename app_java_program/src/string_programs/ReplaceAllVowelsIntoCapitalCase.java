package string_programs;

public class ReplaceAllVowelsIntoCapitalCase  {

	public static void main(String[] args) {
		String string = "intelcore";
		
		System.out.println("Original String is : "+string);
		
		String str = lowerToUpperCase(string);
		System.out.println("Lower to Uppper String is : "+str);

	}

	private static String lowerToUpperCase(String string) {
		StringBuilder builder = new StringBuilder();
		
		for (char ch : string.toCharArray()) {
			if("aeiou".indexOf(ch)!=-1) {
				builder.append(Character.toUpperCase(ch));
			}else {
				builder.append(ch);
			}
		}
		
		return builder.toString();
	}
}
