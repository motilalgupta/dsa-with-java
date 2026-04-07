package VariableAndDataTypes;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int a = 23, b = 82;
//        int sum = a+b;
//        System.out.println(sum);

        // sum of a and b;

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter the value of b: ");
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.println("The sum of a and b is: "+sum);

        // product of two number;

//        System.out.println("Enter the value of c: ");
//        int c = sc.nextInt();
//        System.out.println("Enter the value of d: ");
//        int d = sc.nextInt();
//        int product = c*d;
//        System.out.println("The prodcut is: "+product);

        // calculate area of circle

        System.out.println("Enter the radius: ");
        float r = sc.nextFloat();
        float area = 3.14f*r*r;
        System.out.println("The area is: "+area);
    }
}
