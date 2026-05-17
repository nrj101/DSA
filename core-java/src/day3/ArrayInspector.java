package day3;

// Write three methods: findMin(int[] arr), findMax(int[] arr), 
// linearSearch(int[] arr, int target). Call all three from main on the 
// same array and print results. Then check if the array is sorted.
public class ArrayInspector {

	public static void main(String[] args) {
		
		//int [] myArray = {12, 23, 45, 67, 22, 93, 50, 19, 26, 5, 92, 6, 34, 48, 51, 2, 39};
		int [] myArray = {10, 7, 6, 2, 1};
		
		int searchResult, searchKey = 6;
		
		System.out.println("Searching for "+searchKey);
		
		searchResult = linearSearch(myArray, searchKey);
		
		if(searchResult>=0)
			System.out.println("First match found at index: "+searchResult);
		else
			System.out.println("No match found");
		
		
		System.out.println("Min: "+findMin(myArray)+"  |  Max: "+findMax(myArray)+"  |  IsSorted?: "+isSorted(myArray));

	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i=0; i< arr.length; i++) {
			if(arr[i]< min)
				min = arr[i];
			
		}
		return min;
	}
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i=0; i< arr.length; i++) {
			if(arr[i]> max)
				max = arr[i];
			
		}
		return max;
	}
	
	public static int linearSearch(int[] arr, int target) {
		for(int i=0; i<arr.length; i++)
			if(arr[i] == target)
				return i;
		return -1;
	}
	
	public static String isSorted(int[] arr) {
		
		boolean checkAsc=true, checkDesc=true;
		
		// check if sorted in ascending
		for(int i=1; i<arr.length; i++)
			if(arr[i]<arr[i-1]) {
				checkAsc=false;
				break;
			}
		
		// check if sorted in descending
		for(int i=1; i<arr.length; i++)
			if(arr[i]>arr[i-1]) { 
				checkDesc=false;
				break;
			}
		
		if (checkAsc) {
			return "Yes | Ascending";
		}else if (checkDesc){
			return "Yes | Descending";
		} 
		return "No";
		
	}

}
