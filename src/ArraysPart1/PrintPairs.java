package ArraysPart1;

public class PrintPairs {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);
    }
    public static void printPairs(int numbers[]){
        int count = 0;
        for(int i = 0; i<=numbers.length-1; i++){
            int current = numbers[i];
            for(int j = i+1; j<=numbers.length-1; j++){
                System.out.print("("+current+","+numbers[j]+")");
                count++;
            }
            System.out.println();
        }
        System.out.println(count);
    }
}
