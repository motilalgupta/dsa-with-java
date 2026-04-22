package Methods;

import java.util.Scanner;

public class PrimesRangePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        primesRange(n);
    }
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2){
            return true;
        }else{
            for (int i = 2; i<=Math.sqrt(n); i++){
                if(n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void primesRange(int n){
        for(int i = 2; i<=n; i++){
            if(isPrime(i) == true){
                System.out.print(i+" ");
            }
        }
    }
}
