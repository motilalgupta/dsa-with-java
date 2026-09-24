package String;

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        if(s1.length() == s2.length() && (s1+s2).contains(s2)){
            System.out.println("String is rotation");
        }else{
            System.out.println("String is not rotation");
        }
    }
}
