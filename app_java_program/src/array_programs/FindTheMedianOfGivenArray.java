package array_programs;

public class FindTheMedianOfGivenArray {

	public static void main(String[] args) {
		int[] arr1 = {1,2};
		int[] arr2 = {3,4};
		
		double median = findMedianOfArray(arr1,arr2);
		System.out.println(median);
	}

	private static double findMedianOfArray(int[] arr1, int[] arr2) {

		int[] ans = mergeArray(arr1,arr2);

		if(ans.length %2==0) {
			double result1 = (double)(ans[ans.length/2 + ans.length/2-1])/2;
			return result1;
		}else {
			double result2 = (double)(ans[ans.length/2]);
			return result2;
		}
	}

	private static int[] mergeArray(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length+arr2.length];
		
		int p1=0, p2=0, p3=0;
		
		while(p1<arr1.length || p2<arr2.length) {
			int val1 = p1<arr1.length ? arr1[p1] : Integer.MAX_VALUE;
			int val2 = p2<arr2.length ? arr2[p2] : Integer.MAX_VALUE;
			
			if(val1<val2) {
				ans[p3] = val1;
				p1++;
			}else {
				ans[p3]= val2;
				p2++;
			}
			
			p3++;
		}
		
		return ans;
	}
}
