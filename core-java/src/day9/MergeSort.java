package day9;

// Program to implement merge sort algorithm

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public class MergeSort {
    public static void main(String[] args) {
        int size = 10;

        int[] myArray = new int[size];
        for(int i=0; i<size; i++)
            myArray[i] = ThreadLocalRandom.current().nextInt(1, 101);

        System.out.println("\nOriginal array: "+ Arrays.toString(myArray));

        mergeSort(myArray, 0, size-1);

        System.out.println("\nSorted array: "+ Arrays.toString(myArray));
    }

    public static void mergeSort(int[] arr, int left, int right){

        if(left<right){
            int mid = left + (right - left) / 2 ;

            mergeSort(arr, left, mid);

            mergeSort(arr, mid+1, right);

            merge(arr, left, mid, right);
        }


    }

    public static void merge(int[] arr, int left, int mid, int right){

        // sizes of left and right arrays
        int szL = mid - left +1;
        int szR = right - mid; // right -(mid +1) +1 = right -mid

        int[] arrL = new int[szL];
        int[] arrR = new int[szR];

        // Copy left and right sub arrays
        for(int i=0; i<szL; i++)
            arrL[i] = arr[left+i];

        for(int i=0; i<szR; i++)
            arrR[i] = arr[mid+1+i];

        // Modify the original array while merging
        int i=0, j=0, k=left;
        while(i<szL && j<szR){
            if(arrL[i]<=arrR[j]){
                arr[k] = arrL[i];
                i++;
            }else{
                arr[k] = arrR[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while(i<szL)
            arr[k++] = arrL[i++];
        while(j<szR)
            arr[k++] = arrR[j++];

    }

}
