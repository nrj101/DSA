package day2.Arrays.SecondLargestElement;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		
		int largest, secondLargest;
		
		int [] arr = {100, 90, 80};//{1, 5, 10, 9, 21, 6, 102, 51, 71, 84, 23, 19, 5, 34, 12, 95};
		
		largest = secondLargest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				secondLargest = largest;
				largest = arr[i];
			}else {
				if(arr[i]>secondLargest) {
					secondLargest = arr[i];
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("\nSecond largest number in the array: "+secondLargest);

	}

}
