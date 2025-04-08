package SortingAlgorithms;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleSort(int[] arr){
        // to consider the elements should be sorted in number of passes
        for (int i = 0; i < arr.length; i++) {
            // then consider sorting should be done after 1st element 
            // We have to conclude that for every ith pass, the largest element from last position will be sorted
            // i.e., if we are going through the 1st pass, then the largest element in the array is sorted at last indexed position
            // i.e., j loop runs from 1 t0 n-i positions
            // Therefore for pass 1 at last 1 element will be sorted correctly
            // likewise, for pass 2 at last 2 elements will be sorted correctly
            // Simultaneously , for pass 3 at last 3 elements will be sorted correctly upto n of elements in the array
            for (int j = 1; j < arr.length-i; j++) {
            if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1] = temp;
            }
        }
    }
    }
}
            
       