package ArraysPart1;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter the element: ");
        int key = sc.nextInt();
        int res = binarySearch(arr, key);
        if(key == -1){
            System.out.println("Element not found!");
        }else{
            System.out.println("Element found at index: "+res);
        }
    }
    public static int binarySearch(int arr[], int key){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}
