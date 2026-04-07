package Loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
//        for(int i = 1; i<=5; i++){
//            if(i == 3){
//                continue;
//            }
//            System.out.print(i+" ");
//        }
        // Question 1:
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the number: ");
            int userNum = sc.nextInt();
            if (userNum % 10 == 0) {
                continue;
            }
            System.out.println("User Entered: "+userNum);
        }while(true);
    }
}
