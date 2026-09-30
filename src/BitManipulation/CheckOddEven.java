package BitManipulation;

public class CheckOddEven {
    public static void main(String[] args) {
        checkOddEven(10);
        checkOddEven(11);
        checkOddEven(3);
    }
    public static void checkOddEven(int num){
        int bitmask = 1;
        if((num & bitmask) == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
