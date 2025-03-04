package array_programs;

public class FindTheMissingNumberFromGivenArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6};
		
		int missing = findMissingNumer(arr);
		System.out.println(missing);
	}

	private static int findMissingNumer(int[] arr) {
		int n = arr.length;
		
		int exceptedNumber = (n+1) * (n+2)/2;
		int actualNumber = 0;
		for (int i = 0; i < arr.length; i++) {
			actualNumber += arr[i];
		}
		
		return exceptedNumber-actualNumber;
	}
}
