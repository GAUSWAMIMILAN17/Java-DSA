package Array.Medium;

public class SetMatrixZeroes {
    static void main(String[] args) {
        int[][] matrix = {
                {1 , 1, 1, 1},
                {1, 0, 0, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1},
        };
        bruteForce(matrix);
    }

    public static void bruteForce(int[][] matrix) {
        int n = matrix.length;
        //for -1 put ever non zero places
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0){
                    markRow(matrix, i, n);
                    markCol(matrix, j, n);
                }
            }
        }

        // Step 2: Convert all -1 to 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }

        //step 3 : display matrix

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void markRow(int[][] matrix, int i, int n) {
        for (int j = 0; j < n; j++) {
            if(matrix[i][j] == 1){
                matrix[i][j] = -1;
            }
        }
    }

    public static void markCol(int[][] matrix, int j, int n) {
        for (int i = 0; i < n; i++) {
            if(matrix[i][j] == 1){
                matrix[i][j] = -1;
            }
        }
    }
}
