package Recursion;

public class SumOfNum {
    static void main() {
        int n = 5;
        System.out.println("Sum= "+sum(n));
    }
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n - 1);
    }
}
