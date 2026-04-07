package ConditionalStatement;

import java.util.Scanner;
public class PracticeSet {
    public static void main(String[] args) {
       // Question 1 : Write a program to get a number from the user and print whether it is
       // positive or negative.

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the number : ");
//        int num = sc.nextInt();
//
//        if(num>=0){
//            System.out.println("Positive Number");
//        }else{
//            System.out.println("Negative Number");
//        }

        // Question 2 : Finish the following code so that it prints You have a fever if your temperature
        // is above 100 and otherwise prints You don't have a fever.

//        double temp = 103.5;
//        if(temp>=100){
//            System.out.println("You have a fever");
//        }else{
//            System.out.println("You don't have a fever");
//        }

        // Question 3 : Write a java program to input week number(1-7) and print day of week name
        // using switch case.

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the week number: ");
//        int week = sc.nextInt();
//
//        switch(week){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Day not found!");
//        }

        // Question 4 : Write a java program to takes a year from the user and print whether that
        // year is a leap year or not

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if((year%4 == 0 && year%100 != 0) || year%400 == 0){
            System.out.println("The year have entered is Leap Year");
        }else{
            System.out.println("Not a Leap Year ");
        }

        // Question 5 : What will be the output of this code

//        int a = 63, b = 36;
//        boolean x = (a<b) ? true : false;
//        int y = (a>b) ? a : b;
//        System.out.println(x);        output : false
//        System.out.println(y);        output : 63

    }
}
