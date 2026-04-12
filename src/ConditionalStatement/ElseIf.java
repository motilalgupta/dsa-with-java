
package ConditionalStatement;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
//        int age = 10;
//
//        if(age>=18){
//            System.out.println("Adult");
//        }else if(age>13 && age<18){
//            System.out.println("Teenager");
//        }else{
//            System.out.println("Child");
//        }

        //  Question 2;

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your income : ");
//        int income = sc.nextInt();
//        int tax = 0;
//
//        if(income<500000) {
//            System.out.println("Tax : " + (tax = (int) (income * 0)));
//        }
//        else if(income>=500000 && income<=10000){
//            System.out.println("Tax : " + (tax = (int) (income * 0.2)));
//        } else{
//            System.out.println("Tax : " +  (tax= (int) (income * 0.3)));
//        }

        // Questoin 3;

        int a = 10, b = 21, c = 4;
        if(a>b && a>c){
            System.out.println("A is grater");
        }
        else if(b>a && b>c){
            System.out.println("B is grater");
        }else{
            System.out.println(" C is grater");
        }
    }
}
