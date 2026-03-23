package Array;
import java.util.*;
public class Matrix
{
    Scanner sc = new Scanner(System.in);
    int[][] matrixA;
    int[][] matrixB;
    int[][] matrixC;


    public Matrix(int m, int n, int p)
    {
        matrixA = new int[m][p];
        matrixB = new int[p][n];
        matrixC = new int[m][n];
    }
    public void InputArray(int[][] matrix , int m, int n)
    {
        System.out.println("Enter the values for a " + m + " * " + n + " matrix");
        for (int r = 0; r < m; r++)
        {
            for (int c = 0; c < n; c++)
            {
                System.out.print("Enter value for elemnt [" + r + "][" + c +"]: ");
                matrix[r][c] = sc.nextInt();
            }
        }
    }
    public void OutputArray(int[][] matrix , int m, int n)
    {
        System.out.println("\nthe entered values " + m + " * " + n + " matrix");
        for (int r = 0; r < m; r++)
        {
            for (int c = 0; c < n; c++)
            {
                System.out.print(matrix[r][c] + "\t");

            }
        }
    }

    public int[][] Multiplication(int[][] matrixA , int[][] matrixB , int m , int n , int p)
    {
        for(int k=0; k<m; k++)
        {
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<p; j++)
                {
                    matrixC[k][i] += matrixA[k][j] * matrixB[j][i];
                }
            }
        }
        return matrixC;
    }
    public static void main(String[] args)
    {
        Matrix m = new Matrix(3 , 3 , 2);

        m.InputArray(m.matrixA, 3, 2);
        m.InputArray(m.matrixB, 2, 3);

        // Output matrices
        System.out.println("Matrix A:");
        m.OutputArray(m.matrixA, 3, 2);
        System.out.println("Matrix B:");
        m.OutputArray(m.matrixB, 2, 3);

        // Multiply matrices
        m.matrixC = m.Multiplication(m.matrixA, m.matrixB, 3, 3, 2);

        // Output result
        System.out.println("Matrix C (Multiplication Result):");
        m.OutputArray(m.matrixC, 3, 3);
    }
}