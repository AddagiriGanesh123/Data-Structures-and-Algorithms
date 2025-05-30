package BackTrackingIntro;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(Queens(board,0)); // here 0 indicates it starts from 0th row
    }
    static int Queens(boolean[][] board,int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        // placing the queen and checking for row and column
        for (int col = 0; col < board.length; col++) {
            // here place the queen when it is safe
            if(isSafe(board,row,col)){
                board[row][col] = true;// It states that queen is placed at this position
                count += Queens(board, row+1);// then we call the function for the next row
                 // Coming out of this loop means we have placed the queen at this position
                 // then we have to remove the queen from this position
                 // so we are checking for row and column
                 board[row][col] = false; // checking the conditions here otherwise it will be placed at this position
            }
        }
        return count;
    }
    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check for the verical row here, if queen is already present here then return false
        for (int i = 0; i < row; i++) {
            if(board[i][col]==true){
                return false;
            }
        }
        // check the condition for diagonal left
        int maxleft = Math.min(row, col);
        for (int i = 1; i <= maxleft; i++) {
            if(board[row - i][col-i]){
                return false;
            }
        }
        // check the condition for diagonal right whether queen is present or not
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row - i][col+i]){
                return false;
            }
        }
        return true;
    }
    private static void display(boolean[][] board) {
        // for every row in my board
        for(boolean[] row : board){
            // for every element in the row
            for (boolean element : row) {
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}

// Using Akra -Bazzi method to solve the problem
// Time complexity: O(n!) and space complexity: O(n!) as well
// Recurrence relation : T(n) = n * T(n-1) + n^2

