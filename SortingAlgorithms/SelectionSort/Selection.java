import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        // Traverse through all array elements
        // i.e., run the loop from 0 th n-1 indexed positions in the array
        // I f we have 5 elements in the array, we will run the loop, 5 times
        for (int i = 0; i < arr.length; i++) {  // 0 to 4 -> 5 times
            int last = arr.length - i - 1; // last index of the array to be concluded for every pass
            int maxIndex  = getMaxIndex(arr,0,last);
            // Then finally swap the max element with the last element of the array
            swap(arr,maxIndex,last);
        }
    }
    // Method to find out the max element
    static int getMaxIndex(int[] arr,int start,int last){
        int max = start;
        for (int i = start; i <= last; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    // Method to swap two elements in the array
    // Here swapping is done between max element and last element of the array
    // i.e., getMaxIndex and last element are swapped according to the correct position
    static void swap(int[] arr,int getMaxIndex,int last){
        int temp = arr[getMaxIndex];
        arr[getMaxIndex] = arr[last];
        arr[last] = temp;
    }
}
        
    

