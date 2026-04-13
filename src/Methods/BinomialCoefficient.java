package Methods;

public class BinomialCoefficient {
    public static void main(String[] args) {
        int binomialCoefficient = binCoff();
        System.out.println("The BC is: "+binomialCoefficient);


    }
    public static int binCoff(){
        int a = nFact(5);
        int b = rFact(2);
        int c = nMinusRFact(5,2);
        int bc = a/(b*c);
        return bc;
    }
    public static int rFact(int r){
        int r_fact = 1;
        if(r == 0 || r == 1){
            return 1;
        }
        for(int i = 1; i<=r; i++){
            r_fact *=i;
        }
        return r_fact;
    }
    public static int nFact(int n){
        int n_fact = 1;
        if(n == 1 || n == 0){
            return 1;
        }
        for(int i = 1; i<=n; i++){
            n_fact *= i;
        }
        return n_fact;
    }
    public static int nMinusRFact(int n, int r){
        int number = n-r;
        int n_minus_r_fact = 1;
        if(number == 0 || number == 1){
            return 1;
        }
        for(int i = 1; i<=number; i++){
            n_minus_r_fact *=i;
        }
        return n_minus_r_fact;
    }

}
