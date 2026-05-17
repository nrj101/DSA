package day2.Arrays.RotateArrayRightK;

import java.util.Arrays;

public class MethodsApproach {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		
		int k = 4; // Set k = k%length to handle k>length of array
		
		System.out.println("Original array:"+Arrays.toString(arr));
		
		reverse(arr, 0, arr.length-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, arr.length-1);
		
		
		System.out.println("Rotated right by "+k+" elements: "+Arrays.toString(arr));

	}
	
	public static void reverse (int arr[], int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++; end--;
		}
	}

}
