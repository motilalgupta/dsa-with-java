package Methods;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int binaryNum = sc.nextInt();
        binaryNum(binaryNum);
    }
    public static void binaryNum(int binaryNum){
        int original = binaryNum;
        int pow = 0;
        int dec = 0;
        while (binaryNum>0){
            int lastDigit = binaryNum % 10;
            dec += (lastDigit * (int) Math.pow(2,pow));
            binaryNum /= 10;
            pow++;
        }
        System.out.println("The decimal of "+original+" is: "+dec);
    }
}
