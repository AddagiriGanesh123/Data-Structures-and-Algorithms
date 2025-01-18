//import java.util.Arrays;

public class LinearSearchProblems {
    public static void main(String[] args) {
    //     int[][] arr={{1,2,3},
    //                {13,78,45,78},
    //             {9,100,76,32}};
    //     int target=78;
    //     int[] result=linearSearch(arr,target);
    //     System.out.println(Arrays.toString(result));
    // }
    // static int[] linearSearch(int[][] nums,int target){
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = 0; j < nums[i].length; j++) {
    //         if(nums[i][j]==target){
    //             return new int[]{i,j};
    //         }
    //     }
    // }
    //     return new int[]{-1,-1};
    String str="ganesh";
    char target='s';
    System.out.println(search(str,target));
    //System.out.println(res);
    }
    static boolean search(String str,char find){
        for(char character:str.toCharArray()){
            if(character==find){
                return true;

            }
        }
        return false;
    }
}
