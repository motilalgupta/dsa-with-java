package Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // Question 1
//        int counter = 0;
//        while(counter<100){
//            System.out.println("Hello World!");
//              counter++;
//        }


 //Question 2 : Print number 1 to 10
//            int counter = 1;
//            while(counter<=10){
//                System.out.println(counter);
//                counter++;
//            }

        // Question 3: Print number from 1 to n
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the range: ");
//        int n = sc.nextInt();
//
//        int counter = 1;
//        while(counter<=n){
//            System.out.println(counter);
//            counter++;
//        }
        // Question 4: Print the sum of first n natural number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("The sum is: "+sum);
    }
}
