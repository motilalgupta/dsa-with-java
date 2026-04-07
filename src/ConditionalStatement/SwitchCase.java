package ConditionalStatement;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

//        int num = 2;
//
//        switch (num) {
//            case 1: System.out.println("Samosa"); break;
//            case 2: System.out.println("burger"); break;
//            case 3: System.out.println("Mango Shake"); break;
//            default: System.out.println("Now realize I was dreaming"); break;
//        }

        // Question 2?

        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the Operator : ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+': System.out.println("Addition : "+ (a+b)); break;
            case '-': System.out.println("Subtraction: "+ (a-b)); break;
            case '*': System.out.println("Multiplication : "+ (a*b)); break;
            case '/': System.out.println("Division : "+ (a/b)); break;
            default : System.out.println("Default"); break;
        }
    }
}
