package Methods;

public class BinomialCoefficientOptimize {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        int BC = factorial(n) /(factorial(r)*factorial(n-r));
        System.out.println("The BC is: "+BC);
    }
    public static int factorial(int num){
        int fact = 1;
        if(num == 0 || num == 1){
            return 1;
        }
        for(int i = 1; i<=num; i++){
            fact *= i;
        }
        return fact;
    }
}
