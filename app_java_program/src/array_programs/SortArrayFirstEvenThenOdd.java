package array_programs;

public class SortArrayFirstEvenThenOdd {
	
	public static void main(String[] args) {
		
		int[] arr = {11,80,34,77,44,65,90,23,54};
		System.out.println("Original Array");
		printArray(arr);
		System.out.println("Sorted Array");
		sortedArray(arr);
		printArray(arr);
		
	}

	private static void sortedArray(int[] arr) {
		int left=0,right = arr.length-1;
		
		while(left<right) {
			if(arr[left]%2==1 && arr[right]%2==0) {
				int temp= arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			
			if(arr[left]%2==0) {
				left++;
			}
			
			if(arr[right]%2==1) {
				right--;
			}
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
