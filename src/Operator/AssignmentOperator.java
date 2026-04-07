package Operator;

public class AssignmentOperator {
    public static void main(String[] args){
        int a = 5, b = 5, c = 5, d = 5, e = 5;

//         a = a + 10;
//         b = b - 10;
        a += 10;
        b -= 10;
        c *= 10;
        d /= 10;
        e %= 10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
