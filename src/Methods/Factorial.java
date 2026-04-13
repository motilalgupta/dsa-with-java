package Methods;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int res = factorial(number);
        System.out.println("The factorial is: "+res);
    }
    public static int factorial(int number){
        int factorial = 1;
        if(number == 1 || number == 0){
            return 1;
        }
        for(int i = 1; i<=number; i++){
            factorial *= i;
        }
        return factorial;
    }
}
