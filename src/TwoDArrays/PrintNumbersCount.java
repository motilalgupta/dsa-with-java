package TwoDArrays;

public class PrintNumbersCount {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,7},{9,7,3}};
        printNumbersCount(matrix);
    }
    public static void printNumbersCount(int matrix[][]){
        int count = 0;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0;j<matrix[0].length; j++){
                if(matrix[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("Total number of 7 is: "+count);
    }
}
