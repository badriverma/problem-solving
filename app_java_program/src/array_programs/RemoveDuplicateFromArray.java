package array_programs;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] x= {1,1,2,3,3,4,5,5,6,7,7,8,9};
		int[] arr = new int[x.length];
		int y=0;
		
		for (int i = 0; i < x.length-1; i++) {
			if(x[i]!= x[i+1]) {
				arr[y] =x[i];
				y++;
			}
			
			arr[y] =x[x.length-1];
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
