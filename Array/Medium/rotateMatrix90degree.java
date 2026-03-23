package Array.Medium;

import java.util.Arrays;

public class rotateMatrix90degree {

    static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

//        displayMatrix(matrix);
//        rotateMatrixBruteForce(matrix);
        optimalMatrix(matrix);
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateMatrixBruteForce(int[][] matrix) {
        int [] [] ans = new int [matrix.length][matrix.length];
        int n = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                ans[j][(n-1)-i] = matrix[i][j];
            }
        }
        displayMatrix(ans);
    }

    public static void optimalMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i <= n-2; i++) {
            for (int j = i+1; j <=n-1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        reverseRows(matrix, n,n);
        displayMatrix(matrix);
    }

    public static void reverseRows(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][col - 1 - j];
                matrix[i][col - 1 - j] = temp;
            }
        }
    }


}
