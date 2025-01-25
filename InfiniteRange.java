public class InfiniteRange {
    public static void main(String[] args) {
        int[] arr={4,5,67,88,99,120,345,678,999,10209};
        int target=999;
        int ans=range(arr,target);
        System.out.println(ans);
    }
    static int range(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            end=end+(end-start)+1;
            start=newStart;
        }
        return search(arr,target,start,end);
    }
    static int search(int[] arr,int target,int start,int end){
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
