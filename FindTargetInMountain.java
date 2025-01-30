/*https://leetcode.com/problems/find-in-mountain-array/description/
1.First find the peak element in the given array
2.search from start to peak as Ascending path
3.search from peak+1 to end as Descending path
*/
public class FindTargetInMountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        int result=search(arr,target);
        System.out.println(result);
    }
    public static int search(int[] arr,int target){
        //FInd out the peak element
        int peak=peakInMountain(arr,target);
        //search in the left half
        int firstTry=orderAgnosticBS(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }
    public static int peakInMountain(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static int orderAgnosticBS(int[] arr,int target,int start,int end){
        boolean isAscending=arr[start]>arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isAscending){
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
        else{
            if(target<arr[mid]){
                start=mid+1;
            }
            else if(target>arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }

        }
    }
    return -1;
}
}