package ArraysPart1;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {1,4,9,7,10,15,20,30};
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        int index = linearSearch(numbers,target);
        if(target == -1){
            System.out.println("Not found!");
        }else{
            System.out.println("Element found at index: "+index);
        }
        sc.close();
    }
    public static int linearSearch(int numbers[], int target){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == target){
                return i;
            }
        }
        return -1;
    }
}
