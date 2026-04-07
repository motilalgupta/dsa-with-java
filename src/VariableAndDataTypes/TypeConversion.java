package VariableAndDataTypes;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
//        int a = 23;
//        long b = a;
//        long a = 23;
//        int b =  a; // not possible
//        System.out.println(b);

        // Type Casting

//        long l = 23;
//        int i = (int)l; // possible by casting. It'll lose data, it is explicit type casting
//        System.out.println(i);
//
//        float marks = 99.999f;
//        int marks2 = (int)marks; // data loose
//        System.out.println(marks2);

        // Type Promotion
        // 1. byte, short, and ch are promoted to int
        char a = 'a';
        char b = 'b';
//        char res = b-a; // throw an error because the expression is promoted into int
        System.out.println((int)(b));
        System.out.println((int)(b));
        System.out.println(b-a);

        short s = 4;
        byte c = 20;
        char ch ='a';
//        byte bt = (s+c+ch); it will say required type byte provided int;
        int bt = s+c+ch;
        System.out.println(bt);

        // 2. int, float, double, long are promoted to the big data type

        int r = 10;
        float f = 29.4f;
        long l = 3832;
        double d = 382;
        double ans =  (r+f+l+d);
        System.out.println(ans);

    }
}
