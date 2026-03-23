package BackTracking;

public class nQueens1Sol {

    public static boolean isSafe( char [][] board, int row, int col) {
//        verticle up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

//        daigonel left
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

//        daigonel right
        for(int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean nqueens(char [][] board, int row){
        //base case
        if(row==board.length){
            count++;
//            printBoard(board);
            return true;
        }

        //column ma placed
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                if(nqueens(board,row+1)){
                    return true;
                }
                board[row][j] = '.';
            }
        }
        return false;
    }
    static int count = 0;
    public static void printBoard(char [][] board){
        System.out.println("----------------Chesh Board---------------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void main() {
        int n = 4;
        char[][] board = new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        if(nqueens(board,0)){
            System.out.println("Solution is posible");
            printBoard(board);
        } else {
            System.out.println("No solution");
        }
//        System.out.println("total way to solve n queens:"+count);

    }
}
