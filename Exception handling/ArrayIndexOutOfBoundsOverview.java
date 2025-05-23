package ExceptionHandling;

public class ArrayIndexOutOfBoundsOverview {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[arr.length+1 * 34]);// More than the size we decided.
        // Exception raises likes this:-
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
        //  ExceptionHandling.ArrayIndexOutOfBoundsOverview.main(ArrayIndexOutOfBoundsOverview.java:6)

        // ArrayIndexOutOfBounds Exception is thrown when we try to access an array with an index 
        // that is either negative or greater than or equal to the length of the array.
    }
    
}
