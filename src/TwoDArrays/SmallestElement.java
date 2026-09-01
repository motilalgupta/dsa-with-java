package TwoDArrays;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert matrix elements: ");
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        printSmallestElement(matrix);
    }
    public static void printSmallestElement(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]<smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("The smallest elements is: "+smallest);
    }
}
