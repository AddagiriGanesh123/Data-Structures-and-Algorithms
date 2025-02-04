public class LargeArraySplit {
    public static void main(String[] args) {
       int[] nums = {7,2,5,10,8};
       int k = 2;
       System.out.println(splitArray(nums,k));
    }
    public static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for (int i = 0; i < nums.length; i++) {
            // Start is used to find the sum of elements in an given array
            // also End is used to find the maximum element of an array
            //So, store the sum of elements in an array in start and maximum element in end
            start=Math.max(start, nums[i]);
            end+=nums[i];
        }
        //Run Binary Search here
        while(start<end){
            int mid=start+(end-start)/2;
            //Conclude pieces that the array can be split into number of sub arrays
            //and also define sum to store the value
            int sum=0;
            int pieces=1;//initially one piece means, by default it should be one array
            for(int num:nums){
                if(num+sum>mid){
                    //If the sum elements in array greater than mid then create that element should be in the new subarray
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            // Here we check if the number of pieces is greater than k
            // if yes then we need to increase the mid value
            // else we need to decrease the mid value
            // so we can find the minimum value of mid which will be the answer
            // because we need to find the minimum value of mid which will be the answer
            if(pieces<=k){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
