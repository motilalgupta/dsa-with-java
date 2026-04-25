package Methods;

import java.util.Scanner;

public class PracticeQuestions {
    public static void main(String[] args) {
        // Question 1
        // Write a Java method to compute the average of three number;

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the first number: ");
//        double num1 = sc.nextInt();
//        System.out.print("Enter the second number: ");
//        double num2 = sc.nextInt();
//        System.out.print("Enter the third number: ");
//        double num3 = sc.nextInt();
//
//        calculateAvg(num1,num2,num3);

        // Question 2
        // Write a method named isEven that accepts an int argument. The method should return true if the argument
        // is even, or false otherwise. Also write a program to test your method.

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(isEven(num)){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }

        // Question 3
        //
    }
    // Question 1
    public static void calculateAvg(double num1, double num2, double num3){
        double avg = ((num1+num2+num3)/3);
        System.out.println("The average of three number is: "+avg);
    }

    // Question 2
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }

    // Question 3

}
