package SortingAlgorithms;
import java.util.Arrays;
// Important to note: If we want to sort the array in single pass i.e., only with one for loop then we use Cycle Sort
public class Cycle {
    public static void main(String[] args) {
        int[] arr = {3,4,2,5,1};
        CycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void CycleSort(int[] arr){
        int i = 0;
        int n = arr.length;
        // Here while loop usually runs from 0th index to n-1th index 
        while(i<n){ 
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int i, int correctIndex ){
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
