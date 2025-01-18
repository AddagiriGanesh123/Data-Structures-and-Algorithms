public class BinarySearchProblem{
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int target=9;
        int result=binary(arr,target);
        System.out.println(result);
    }
    static int binary(int[] nums,int goal){
        int left=0;
        int right=nums.length-1;
        //int mid=left+(right-left)/2;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(goal<nums[mid]){
                right=mid-1;
            }
            else if(goal>nums[mid]){
                left=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}