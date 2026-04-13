package Methods;

public class CallByValue {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

//        System.out.println("a ="+a);
//        System.out.println("b ="+b);
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println("a ="+a);
//        System.out.println("b ="+b);

        // with method;
        swap(a,b);
        System.out.println("a ="+a);
        System.out.println("b ="+b);        // output: original value of a and b
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
//        System.out.println("a ="+a);      // output: swaped value
//        System.out.println("b ="+b);
    }
}
