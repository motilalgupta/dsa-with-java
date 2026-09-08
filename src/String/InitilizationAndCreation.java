package String;

import java.util.Scanner;

public class InitilizationAndCreation {
    public static void main(String[] args) {
        String name = "Motilal";
        System.out.println(name);
        String str = new String("Motilal");

        // user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
//        String string = sc.next();   // for single word
        String string = sc.nextLine();  // for multiple word
        System.out.println(string);

        // length
        int length = name.length();
        System.out.println(length);

        // concatnation
        String fName = "Motilal";
        String fuName = fName.concat(" Gupta");
        System.out.println(fuName);

        String firstName = "Motilal";
        String lastName = "Gupta";
        String fullName = firstName + " "+ lastName;
        System.out.println(fullName);

        // traversing
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
}
