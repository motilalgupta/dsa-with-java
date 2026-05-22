package ArraysPart1;

import java.util.Scanner;

public class InputOutputUpdate {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of arrys is: "+marks.length);
        System.out.print("Enter the marks of Physics: ");
         marks[0] = sc.nextInt();
        System.out.print("Enter the marks of Chemistry: ");
         marks[1] = sc.nextInt();
        System.out.print("Enter the marks of Math: ");
         marks[2] = sc.nextInt();

        System.out.println("Phy: "+marks[0]);
        System.out.println("Chem: "+marks[1]);
        System.out.println("Math: "+marks[2]);

        marks[2] = 100;
        marks[2] += 1;

        System.out.println(marks[2]);
        float percentage = ((float) (marks[0] + marks[1] + marks[2]) /3);
        System.out.println("Percentage is: "+percentage);
    }
}
