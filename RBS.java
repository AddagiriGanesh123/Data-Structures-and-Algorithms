// Approach:
// 1.Find pivot 
// 2.search from start till pivot-1
// 3.search from pivot+1 till end
public class RBS {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr,int target){
        int pivot=findPivot(arr);
        //If there is no pivot in the given array then do simple binary search
        if(pivot==-1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        //If pivot is the target element then return pivot particularly
        if(arr[pivot]==target){
            return pivot;
        }
        //We have to understand that the target element is usually greater then the start element if array is rotated,
        //Then the quite simple logic is that the elements after the pivot should be less than than the start element with accordance to pivot.
        if(target>=arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }
    public static int findPivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //If the middle element is the pivot then return pivot by the way
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            //If the Previous element to the mid is greater than mid then ereturn mid-1 element
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            //If the element at start>mid then element lies after mid should be less than the mid, so end=mid-1;
            if(nums[mid]<=nums[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
