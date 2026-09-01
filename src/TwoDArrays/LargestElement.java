package TwoDArrays;

import com.sun.jdi.Value;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the matrix elements: ");
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

        printLargestElements(matrix);
    }
    public static void printLargestElements(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]>largest){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("The largest element is: "+largest);
    }
}
