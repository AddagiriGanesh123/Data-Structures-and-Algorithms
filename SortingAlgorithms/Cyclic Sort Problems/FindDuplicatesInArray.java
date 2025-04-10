package SortingAlgorithms;
/*🧩 Example Step-by-Step
Given: {1, 3, 4, 2, 2}

Start at index 0: value is 1 → already at the correct spot (index 0), move on.

Index 1: value is 3 → should be at index 2, so swap.

Now array = {1, 4, 3, 2, 2}

Index 1 again: now value is 4 → should be at index 3, swap.

Now array = {1, 2, 3, 4, 2}

Index 1 again: now value is 2 → should go to index 1 (wait… it's already there! but there's already a 2 there 😮)

That means — duplicate found! → 2

✅ Why this is smart?
It works in O(n) time (very fast).

Doesn't use any extra space.

Works by moving elements to their right positions, and catching the collision. */
public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] arr) {
        int i =0;
        int n = arr.length;
        while(i<n){
            if(arr[i]!=i+1){
            int correctElementIndex = arr[i] - 1;
            if(arr[i]!=arr[correctElementIndex]){
                swap(arr, i, correctElementIndex);
            }else{
                return arr[i];
            }
        }else{
            i++;
        }
        }
        return -1;
    }
        
       public static void swap(int[] arr, int i, int correctElementIndex){
            int temp = arr[i];
            arr[i] = arr[correctElementIndex];
            arr[correctElementIndex] = temp;
        }
    }
