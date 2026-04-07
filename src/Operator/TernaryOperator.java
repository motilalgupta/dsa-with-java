package Operator;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//
//        String result = (num % 2 == 0) ? "Even" : "Odd";
//        System.out.println(result);

        // Question 2?


        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        String res = (marks>=33) ? " Pass " : " Fail ";
        System.out.println(res);

    }
}
