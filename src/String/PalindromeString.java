package String;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        boolean res = printPalindrome(str);
        if(res){
            System.out.println("It is palindrome string");
        }else{
            System.out.println("Not a palindrome string");
        }
    }
    public static boolean printPalindrome(String str){
        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i) == str.charAt(str.length()-i-1)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
