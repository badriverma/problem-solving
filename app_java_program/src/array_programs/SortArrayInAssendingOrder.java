package array_programs;

public class SortArrayInAssendingOrder {

	public static void main(String[] args) {
		int[] arr= {66,44,11,77,22,99,33,88,55};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp= arr[i];
					arr[i] = arr[j];
					arr[j] =temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
