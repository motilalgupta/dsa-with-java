package Methods;

public class MathClassMethods {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println(Math.max(a,b));  // return maximum of 2 digit

        System.out.println(Math.min(a,b));  // return minimum of 2 digit

        int res = (int) Math.sqrt(25);      // return square root of any value
        System.out.println(res);

        double result = Math.pow(2,3);      // calculate power of any value
        System.out.println(result);

        int positive = Math.abs(-10);       // return positive value of any negative value
        System.out.println(positive);
    }
}
