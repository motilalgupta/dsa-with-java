package TwoDArrays;

public class PrintSumOfSecondRow {
    public static void main(String[] args) {
        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        printSumOfSecondRow(nums);
    }
    public static void printSumOfSecondRow(int nums[][]){
        int sum = 0;
        for(int j = 0; j<nums[0].length; j++){
            sum += nums[1][j];
        }
        System.out.println("Total sum is: "+sum);
    }
}
