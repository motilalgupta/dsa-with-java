package AdvancedPattern;

public class ZeroOneTrainglePattern {
    public static void main(String[] args) {
        zeroOneTraingle(5,5);
    }
    public static void zeroOneTraingle(int row, int column){
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}
