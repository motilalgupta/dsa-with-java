package Methods;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int decNum = sc.nextInt();
        decNum(decNum);
    }
    public static void decNum(int decNum){
        int original = decNum;
        int bin = 0;
        int pow = 0;
        while(decNum>0){
            int rem = (decNum % 2);
            bin += (rem * (int) Math.pow(10,pow));
            pow ++;
            decNum /= 2;
        }
        System.out.println("The Binary of "+original+" is: "+bin);
    }
}
