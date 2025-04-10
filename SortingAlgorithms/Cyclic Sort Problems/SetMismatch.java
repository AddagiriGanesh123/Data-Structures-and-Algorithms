package SortingAlgorithms;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
        // If we are not using Arrays,toString() method , thewn we will get result as [I@3fee733d
        // which is undefined value
        // So for to clear this we are using Arrays.toString() method to get the result for this sum as [2,3];
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i < n){
            int correctElementIndex = nums[i] - 1;
            if(nums[i] != nums[correctElementIndex]){
                swap(nums, i, correctElementIndex);
            }else{
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                return new int[]{nums[index], index+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
