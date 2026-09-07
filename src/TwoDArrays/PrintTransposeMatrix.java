package TwoDArrays;

import java.util.Scanner;

public class PrintTransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printTranspose(sc);
    }
    public static void printTranspose(Scanner sc){

        System.out.print("Enter the size of row: ");
        int row = sc.nextInt();
        System.out.print("Enter the size of col: ");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];

        System.out.print("Enter the matrix elements: ");
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // Before transpose matrix
        for(int i = 0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(" ----------------------------------------- ");
        // After transpose matrix
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
