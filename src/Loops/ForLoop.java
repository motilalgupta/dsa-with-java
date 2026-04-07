package Loops;

public class ForLoop {
    public static void main(String[] args) {
        // Question 1: Print Square patterns
//        for(int lines = 1; lines<=4; lines++){
//            System.out.println("****");
//        }

        // Question 2: Reverse the given number (10899)
//        int n = 10899;
//        while(n>0){
//            int lastDigit = n%10;
//            System.out.print(lastDigit);
//            n /= 10;
//        }
        // Question 3: Reverse the original number which is given and print
        int num = 10899;
        int rev = 0;
        while(num>0){
            int lastDigit = num%10;
            rev = (rev*10) + lastDigit;
            num /= 10;
        }
        System.out.println("Reverse of original num is: "+rev);
    }
}
