package array_programs;

public class NumberIsPowerOfTwo {

	public static void main(String[] args) {
		int n=20;
		
		boolean power = isPowerOfTwo(n);
		System.out.println(power);
	}

	private static boolean isPowerOfTwo(int n) {
		
		if(n<1) {
			return false;
		}else if(n==1) {
			return true;
		}else {
			while(n%2==0) {
				n=n/2;
			}
			
			if(n==1) {
				return true;
			}else {
				return false;
			}
		}
	}
}
