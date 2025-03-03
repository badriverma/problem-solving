package array_programs;

public class SortAndMergetwoArray {

	public static void main(String[] args) {
		int[] arr1 = {1,3,5,7};
		int[] arr2 = {2,4,6,8};
		
		int[] newArray =new int[arr1.length+arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			newArray[i] = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			newArray[arr1.length+i] = arr2[i];
			
		}
		
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray.length; j++) {
				if(newArray[i]<newArray[j]) {
					int temp = newArray[i];
					newArray[i] = newArray[j];
					newArray[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]+" ");
		}
		
	}
}
