package AdvancedPattern;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        hollowRectangle(4,5);
    }
    public static void hollowRectangle(int row, int column){
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=column; j++){
                if(i == 1 || i == row || j == 1 || j == column){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
