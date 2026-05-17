package day2.Arrays.RotateArrayRightK;

import java.util.Arrays;

public class RotateArrayRightK {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		
		int k = 6;
		
		System.out.println("Original array:"+Arrays.toString(arr));
		
		// Step1: Reverse the whole array (loop runs to swap elements in the first half with those in the second half)
		for(int i=0; i<arr.length/2; i++) {
			
			// swap element at index "i" with element at index "n-i"
			int temp = arr[i];
			
			arr[i] = arr[arr.length - i -1];
			arr[arr.length - i -1] = temp;
		}
		
		//System.out.println("Step 1 Complete: "+Arrays.toString(arr));
		
		// Step2: Reverse the first k elements
		for(int i=0; i<=(k-1)/2; i++) {
					
			// swap element at index "i" with element at index "k-i"
			int temp = arr[i];
			arr[i] = arr[k - i - 1];
			arr[k - i -1] = temp;
		}
		
		//System.out.println("Step 2 Complete: "+Arrays.toString(arr));
		
		
		// Step3: Reverse the last n-k elements
		for(int i=0; i<(arr.length-k)/2; i++) {
							
			// swap element at index "i" with element at index "n-i-1"
			int temp = arr[k+i];
			arr[k+i] = arr[arr.length-1 - i];
			arr[arr.length -1 - i] = temp;
			
			//System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("Rotated right by "+k+" elements: "+Arrays.toString(arr));
		
	}

}
