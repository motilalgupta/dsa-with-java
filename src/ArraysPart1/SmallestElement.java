package ArraysPart1;

public class SmallestElement {
    public static void main(String[] args) {
        int numbers[] = {10, 4, 8, 9, 2,1};
        int smallestElement = smallestEle(numbers);
        System.out.println("The smallest element is: "+smallestElement);
    }
    public static int smallestEle(int numbers[]){
        int smallest = numbers[0];
        for(int i = 0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
}
