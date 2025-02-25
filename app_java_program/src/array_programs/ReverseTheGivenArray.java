package array_programs;

public class ReverseTheGivenArray {

	public static void main(String[] args) {
		
		int n = 123;
		
		int number= reverseTheGiveNumber(n);
		System.out.println(number);
	}

	private static int reverseTheGiveNumber(int n) {
		int reversed=0;
		
		while(n!=0) {
			int digit = n%10;
			n/=10;
			
			if(reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE/10 && digit>7) ) {
				return 0;
			}
			if(reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE/10 && digit<-8)) {
				return 0;
			}
			
			reversed = reversed*10 +digit;
		}
		return reversed;
	}
}
