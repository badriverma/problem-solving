package array_programs;

public class SecondLargestNumberTypeTwo {
	
	public static void main(String[] args) {
		int[] arr = {65,23,76,34,87,22,98,45};
		
		int secondLarge = findSecondLargest(arr);
		System.out.println(secondLarge);
	}

	private static int findSecondLargest(int[] arr) {
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int num : arr) {
			if(num>firstLargest) {
				secondLargest = firstLargest;
				firstLargest = num;
			}else if(num>secondLargest && firstLargest!=num) {
				secondLargest =num;
			}
		}
		
		return secondLargest;
	}
}
