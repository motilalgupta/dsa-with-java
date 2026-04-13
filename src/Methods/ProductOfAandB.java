package Methods;

public class ProductOfAandB {
    public static void main(String[] args) {
        int res = multiply(8,9);
        System.out.println("The product is: "+res);
        res = multiply(10,30);
        System.out.println("The second product is: "+res);
    }
    public static int multiply(int a,int b){
        return a*b;
    }
}
