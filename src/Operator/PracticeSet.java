package Operator;

public class PracticeSet {
    public static void main(String[] args) {
        // Question 1 : What will be the output of the following programs


        // 1.


//        int x = 2, y = 5;
//
//        int exp1 = (x*y/x);
//        int exp2 = (x*(y/x));
//
//        System.out.println(exp1 + " , "+ exp2);         //  output : 5,4


        // 2.


//        int x = 200, y = 50, z = 100;
//        if(x>y && z<x){
//            System.out.println("Hello");
//        }
//        if((y+200)<x && (y+150)<z){                  // output : Hello
//            System.out.println("JAVA");
//        }

        // 3.


//        int x, y, z;
//        x = y = z = 2;
//        x += y;
//        y -= z;
//        z /= (x+y);
//        System.out.println(x +" "+ y + " " + z + " ");       // output : 4 0 0

        // 4.


        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;

        int exp = 4/3 * (x + 34) + 9 * ((a + b) * c) + (3 + y * (2 + a)) / (a + b*y);   // output : 368
        System.out.println(exp);

        // 5.


//        int x = 10, y = 5;
//
//        int exp1 = (y*(x / y + x / y));
//        int exp2 = (y * x / y + y * x / y);           output : 20 20
//
//        System.out.println(exp1);
//        System.out.println(exp2);
    }
}
