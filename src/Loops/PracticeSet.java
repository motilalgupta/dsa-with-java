package Loops;

import java.util.Scanner;

public class PracticeSet {
    public static void main(String[] args) {
        // Question 1: How many times hello is printed?

//        for(int i = 0; i<5; i++){
//            System.out.println("Hello");
//            i += 2;
//        } // output 2 times will print hello

        // Question 2: Write a program to read a set of all integer and then prints the sum of the
        // even and odd integers

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter how many numbers you want: ");
//        int num = sc.nextInt();
//
//        int evenSum = 0;
//        int oddSum = 0;
//        for(int i = 1; i<=num; i++){
//            if(i % 2 == 0){
//                evenSum +=i;
//            }else{
//                oddSum += i;
//            }
//        }
//        System.out.println("Even numbers of total sum is: "+evenSum);
//        System.out.println("Odd numbers of total sum is: "+oddSum);

        // Question 2 repeating with do while loop

//        Scanner sc = new Scanner(System.in);
//        int number;
//        int choice;
//        int evenSum = 0;
//        int oddSum = 0;
//
//        do{
//            System.out.print("Enter the number: ");
//            number = sc.nextInt();
//
//            if(number%2 == 0){
//                evenSum += number;
//            }else{
//                oddSum += number;
//            }
//            System.out.println("Do you want to continue? enter 1 if yes or 0 if no");
//            choice = sc.nextInt();
//        }while(choice == 1);
//        System.out.println("Even numbers sum is: "+evenSum);
//        System.out.println("Odd numbers sum is: "+oddSum);

        // Question 3: What is wrong in this program

//        for(int i = 0; i<5; i++){
//            System.out.println("i = "+i);
//        }
//        System.out.println("i = "+i);   // i declared inside the scope & we are trying to access outside the scope

        // Question 4: Print factorial of any number given by the user

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int number = sc.nextInt();
//        int factorial = 1;
//            if(number == 0 || number == 1){
//                factorial = 1;
//            }else{
//                for(int i = 1; i<=number; i++){
//                    factorial *= i;
//                }
//            }
//        System.out.println("Factorial is: "+factorial);

        // Question 5: Write a program to print the multiplication table of a number N, entered by the user.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(number+" * "+i+" = "+number*i);
        }
    }
}
