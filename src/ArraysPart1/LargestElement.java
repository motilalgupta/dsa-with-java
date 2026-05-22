package ArraysPart1;

public class LargestElement {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6};

        int largestValue = largestElement(numbers);
        System.out.println("The largest element is: "+largestValue);
    }
    public static int largestElement(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
}
