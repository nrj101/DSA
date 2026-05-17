package day2.Arrays.MoveZeroesToEnd;

import java.util.Arrays;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		
		int [] arr = {1, 5, 0, 9, 0, 6, 102, 51, 71, 84, 23, 0, 5, 34, 0, 95};
		
		int leftNonZeroIndex = 0;
		
		System.out.println("\nOriginal array: ");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]!=0){
				// swap
				int temp = arr[leftNonZeroIndex];
				arr[leftNonZeroIndex] = arr[i];
				arr[i] = temp;
				leftNonZeroIndex++;
			}
			
			
		}
		
		
		System.out.println("\nAfter moving zeroes to the end: ");
		System.out.println(Arrays.toString(arr));

	}

}
