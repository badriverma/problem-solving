package array_programs;

public class SortArrayFirstZeroThenOne {

	public static void main(String[] args) {
		int[] arr={1,0,1,0,1,0,1,0,1};
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			if(arr[left]==1 && arr[right]==0) {
				int temp= arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				
				left++;
				right--;
			}
			
			if(arr[left] ==0) {
				left++;
			}
			
			if(arr[right]==1) {
				right--;
			}
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
