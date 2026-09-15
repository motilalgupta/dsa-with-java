package String;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        if(s1.length() != s2.length()){
            System.out.println("String is not anagram");
        }

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("String is anagram");
        }else{
            System.out.println("String is not anagram");
        }
    }
}
