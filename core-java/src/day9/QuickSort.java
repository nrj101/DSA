package day9;

// Program to implement Quick Sort algorithm

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {
    public static void main(String[] args) {
        int size=10;
        int[] myArray = new int[size];

        for(int i=0; i<size; i++)
            myArray[i] = ThreadLocalRandom.current().nextInt(1,101);

        System.out.println("\nOriginal array: "+ Arrays.toString(myArray));

        quickSort(myArray, 0, size-1);

        System.out.println("\nSorted array: "+ Arrays.toString(myArray));

    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivot = randomizedPartition(arr, low, high);

            // sort all elements to the left of the pivot
            quickSort(arr, low, pivot);
            // Next, sort all elements to the right of the pivot
            quickSort(arr, pivot+1, high);
        }
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static int randomizedPartition(int[] arr, int low, int high){
        // pick a random index between low and high (both inclusive)
        int pivot = ThreadLocalRandom.current().nextInt(low, high+1);

        // move this pivot value to the end of the array so that it doesn't get swapped during any iteration
        swap(arr, pivot, high);

        int targetForPivot = low-1;

        // find an index to place Pivot value: numbers_on_left <= pivot value<= numbers_on_the_right
        for(int i=low; i<high; i++){
            if(arr[i] < arr[high]){
                targetForPivot++;
                swap(arr, i, targetForPivot);

            }
        }

        // Put the pivot value (saved at the "high" index) with the next available position for pivot
        swap(arr, high, targetForPivot+1);
        return targetForPivot+1;
    }
}
