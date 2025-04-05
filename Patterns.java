public class Patterns {
    public static void main(String[] args) {
        // Pattern1(5);
        // Pattern2(5);
        // Pattern3(5);
        // Pattern4(5);
        // Pattern5(5);
        // Pattern6(5);
        // Pattern7(5);
        Pattern8(5);

    }
    static void Pattern8(int n){
        // print the Outer loop to print how many rows we want
        for (int row = 1; row <= 2*n; row++) {
            // print the Innner loop to print how many Cols for Cols we want
            int totalColsInRows = row > n?2*n-row:row;
            // also write the logic for Spaces
            int noOfSpaces = row<n?n-row:row-n;
            for (int spaces = 0; spaces < noOfSpaces; spaces++) {
                System.out.print(" ");
            }
            // Print the Stars in the Cols
            for(int col=1;col<=totalColsInRows;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
//      * 
//     * *
//    * * *
//   * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *
    static void Pattern1(int n){
        // print the Outer loop to print how many rows we want
        for (int row = 1; row <= n; row++) {
            // print the Innner loop to print how many Cols for Cols we want
            for(int col=1;col<=n;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
// * * * * * 
// * * * * *
// * * * * *
// * * * * *
// * * * * *

    static void Pattern2(int n){
        // print the Outer loop to print how many rows we want
        for (int row = 1; row <= n; row++) {
            // print the Innner loop to print how many Cols for Cols we want
            for(int col=1;col<=row;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    /*
* 
* *
* * *
* * * *
* * * * * */

static void Pattern3(int n){
    // print the Outer loop to print how many rows we want
    for (int row = 1; row <= n; row++) {
        // print the Innner loop to print how many Cols for Cols we want
        for(int col=1;col<=(n-row)+1;col++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
}

// * * * * * 
// * * * *
// * * *
// * *
// *


static void Pattern4(int n){
    for (int row = 1; row <= n; row++) {
        // print the Innner loop to print how many Cols for Cols we want
        for(int col=1;col<=row;col++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
    // print the Outer loop to print how many rows we want
    for (int row = 1; row <= n; row++) {
        // print the Innner loop to print how many Cols for Cols we want
        for(int col=1;col<=(n-row)+1;col++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
}
// *            
// * *
// * * *
// * * * *
// * * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

static void Pattern5(int n){
    // print the Outer loop to print how many rows we want
    for (int row = 1; row <= n; row++) {
        // print the Innner loop to print how many Cols for Cols we want
        for(int col=1;col<=row;col++){
            System.out.print(col+" ");
        }
        System.out.println();
    }
}
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

static void Pattern6(int n){
    // print the Outer loop to print how many rows we want
    for (int row = 1; row <= n; row++) {
        // print the Innner loop to print how many Cols for Cols we want
        for(int col=1;col<=row;col++){
            System.out.print(row+" ");
        }
        System.out.println();
    }
}
// 1 
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

static void Pattern7(int n){
    // print the Outer loop to print how many rows we want
    for (int row = 1; row <= 2*n; row++) {
        // print the Innner loop to print how many Cols for Cols we want
        int totalColsInRows = row > n?2*n-row:row;
        for(int col=1;col<=totalColsInRows;col++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
}
// * 
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

// static void Pattern8(int n){
//     // print the Outer loop to print how many rows we want
//     for (int row = 1; row <= 2*n; row++) {
//         // print the Innner loop to print how many Cols for Cols we want
//         int totalColsInRows = row > n?2*n-row:row;
//         // also write the logic for Spaces
//         int noOfSpaces = row<n?n-row:2*n-row-n;
//         for (int spaces = 0; spaces < noOfSpaces; spaces++) {
//             System.out.println(" ");
//         }
//         for(int col=1;col<=totalColsInRows;col++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
}
