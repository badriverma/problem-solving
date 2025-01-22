package array_programs;

public class IndexOfSumNumbers {

	public static void main(String[] args) {
		int[] arr= {2,8,7,9,6};
		int target = 9;
		
		int[] findIndex = findIndexOfTwoSumNumbers(arr,target);
		for (int i : findIndex) {
			System.out.print(i+" ");
		}
		
	}

	private static int[] findIndexOfTwoSumNumbers(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return null;
	}
}
