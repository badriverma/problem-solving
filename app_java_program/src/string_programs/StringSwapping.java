package string_programs;

public class StringSwapping {

	public static void main(String[] args) {
		String s1="badri";
		String s2="prasad";
		
		System.out.println("Berfor Swapping");
		System.out.println("s1 is : "+s1);
		System.out.println("s2 is : "+s2);
		
		s1 = s1+s2;
		s2 = s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println("After Swapping");
		System.out.println("s1 is : "+s1);
		System.out.println("s2 is : "+s2);
		
	}
}
