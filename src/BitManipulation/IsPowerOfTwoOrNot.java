package BitManipulation;

public class IsPowerOfTwoOrNot {
    public static void main(String[] args) {
        System.out.println(checkNoOfTwoPowerToOrNot(7));
    }
    public static boolean checkNoOfTwoPowerToOrNot(int n){
        return (n&(n-1)) == 0;
    }
}
