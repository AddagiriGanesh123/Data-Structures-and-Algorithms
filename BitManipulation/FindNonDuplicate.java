package BItManipulation;

public class FindNonDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,6,2,4,3,4};
        int result = findDuplicate(arr);
        System.out.println(result);
    }
    static int findDuplicate(int[] arr){
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique ^=  arr[i];            
        }
        // Enhanced For loop:
        // for(int n : arr){
        //     unique ^= n;
        // }
        return unique;
    }
}
