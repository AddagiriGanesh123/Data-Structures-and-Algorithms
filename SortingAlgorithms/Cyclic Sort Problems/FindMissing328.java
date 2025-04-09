package SortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class FindMissing328 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
     }
     public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i < n){
            int correctIndex = nums[i] - 1;
            // If distinct elements from 1 to n the correctIndex = arr[i]-1
            if(nums[i]!=nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            // If the index is not equal to the value at that index, then that value is missing
            // Then return that value to get the answer
            // BY using Cyclic sort: if we are having elements from 1 to n range then we can use Cyclic sort
            if(nums[index] != index+1){
                res.add(index+1);
            }
        }
        return res;
    }
    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
