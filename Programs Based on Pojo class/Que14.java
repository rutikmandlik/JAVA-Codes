/*
14).WAP to create the class name as MarixMultiplication with a following methods 
*/

import java.util.Scanner;

class MatrixMultiplication {
    int a[][], b[][], result[][];
    
    // Method to accept two 2D arrays (matrices)
    void acceptTwoDArray(int x[][], int y[][]) {
        a = x;
        b = y;
        result = new int[a.length][b[0].length]; // Result matrix with dimensions a_rows x b_columns
    }
    
    // Method to show the multiplication of matrices
    void showMatrixMultiplication() {
        // Display the first matrix
        System.out.println("First Matrix: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Display the second matrix
        System.out.println("Second Matrix: ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        // Perform matrix multiplication
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                result[i][j] = 0;
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Display the resulting matrix after multiplication
        System.out.println("Resultant Matrix after Multiplication: ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Que14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input for the first matrix
        System.out.print("Enter number of rows and columns for the first matrix: ");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        int arr1[][] = new int[rows1][cols1];

        System.out.println("Enter elements of the first matrix: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Input for the second matrix
        System.out.print("Enter number of rows and columns for the second matrix: ");
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();
        int arr2[][] = new int[rows2][cols2];

        // Check if multiplication is possible
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            return;
        }

        System.out.println("Enter elements of the second matrix: ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // Create object of MatrixMultiplication class and call methods
        MatrixMultiplication mm = new MatrixMultiplication();
        mm.acceptTwoDArray(arr1, arr2);
        mm.showMatrixMultiplication();
    }
}
