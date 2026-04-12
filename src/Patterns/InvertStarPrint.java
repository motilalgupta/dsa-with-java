package Patterns;

public class InvertStarPrint {
    public static void main(String[] args) {
        for(int i = 4; i>=0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
