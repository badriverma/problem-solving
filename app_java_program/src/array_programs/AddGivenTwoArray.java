package array_programs;

public class AddGivenTwoArray {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		int[] arr2= {5,6,7,8};
		
		int[] addedArray = new int[arr1.length+arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			addedArray[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			addedArray[arr1.length+i] = arr2[i];
		}
		
		for (int i : addedArray) {
			System.out.println(i);
		}
		
	}
}
