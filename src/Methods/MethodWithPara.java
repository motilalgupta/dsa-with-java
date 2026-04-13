package Methods;

import java.util.Scanner;

public class MethodWithPara {
    public static void main(String[] args) {
//        int addition = addition(3,5);
//        System.out.println("The sum is : "+addition);
//    }
//    public static int addition(int a, int b){
//        return a+b;

        // type 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int y = sc.nextInt();

        int res = addition(x,y);
        System.out.println("The addition is: "+res);

    }
    public static int addition(int a,int b){
        int sum = a+b;
        return sum;
    }
}
