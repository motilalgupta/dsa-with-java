package ArraysPartII;

public class MaxSubArraysSumKadaneAlgo {
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(numbers);
    }
    public static void kadane(int numbers[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length; i++){
            if(currentSum < 0){
                currentSum = 0;
            }
            currentSum += numbers[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Maximum is: "+maxSum);
    }
}
