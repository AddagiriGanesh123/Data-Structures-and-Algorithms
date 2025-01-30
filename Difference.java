import java.util.Arrays;
public class Difference {
public static void main(String[] args) {
    int[] arr={3,-4,6,5,0,9};
    int[] result=new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        int ans=999;
        for (int j = 0; j < arr.length; j++) {
            if(i==j){
                continue;
            }
            int difference=Math.abs(arr[i]-arr[j]);
            if(difference<ans){
                ans=arr[j];
            }
            
        }
        result[i]=ans;
    }
    System.out.println(Arrays.toString(result));
 }
}

