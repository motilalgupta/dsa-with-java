package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n == 2){
            System.out.println("The number which entered by user is prime");
        }else{
            boolean isPrime = true;
//            for(int i = 2; i<n-1; i++){
            for(int i = 2; i<=Math.sqrt(n); i++){ // more optimize logic of prime number.
                if(n % 2 == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("The number which entered by user is prime");
            }else{
                System.out.println("The number which entered by user is not prime");
            }
        }
    }
}
