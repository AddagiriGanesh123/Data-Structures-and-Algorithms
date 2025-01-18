import java.util.Arrays;
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={2,3,4,56,78,999};
        int target=78;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isAsc){
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(arr[mid]==target){
                return new int[]{mid};
            }
            else{
                end=mid-1;
            }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else if(arr[mid]>target){
                    end=mid-1;
                }
                else{
                    return new int[]{mid};
                }

            }
        }
        return new int[]{-1};
    }
}
        
    


        



    




