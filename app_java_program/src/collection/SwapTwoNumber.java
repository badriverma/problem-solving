package collection;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		// type 1
		System.out.println("Before Swapping");
		System.out.println("a is : "+a);
		System.out.println("b is : "+b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping");
		System.out.println("a is : "+a);
		System.out.println("b is : "+b);
		
		// type 2
//		System.out.println("Before Swapping");
//		System.out.println("a is : "+a);
//		System.out.println("b is : "+b);
//		
//		a = a+b; 
//		b = a-b; 
//		a = a-b; 
//		
//		System.out.println("After Swapping");
//		System.out.println("a is : "+a);
//		System.out.println("b is : "+b);
	}
}
