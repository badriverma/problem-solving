package array_programs;

public class RearrangeTheGivenArray {

	public static void main(String[] args) {
		//Input: arr[] = {1, 4, 3, 2, 6, 5}  
		//Output: {5, 6, 2, 3, 4, 1}
		//Explanation: The first element 1 moves to last position, 
		//the second element 4 moves to second-last and so on.
		
		
		int[] arr= {1,4,3,2,6,5};
		
		reArrangeTheArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}

	private static void reArrangeTheArray(int[] arr) {
		int n=arr.length;
		System.out.println(n);
		int[] reArrangeArray = new int[n];
		for (int i : reArrangeArray) {
			System.out.println(i);
		}
		for (int i = 0; i < n; i++) {
			reArrangeArray[i] = arr[n-i-1];

		}
		
		for (int i = 0; i < reArrangeArray.length; i++) {
			arr[i] = reArrangeArray[i];
		}
		
	}
}
