package ArraysPartII;

import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import java.util.Scanner;

public class RotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {3,4,5,6,7,0,1,2};
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        int res = rotatedSortedArray(numbers, target);
        System.out.println("The index of target element is: "+res);
    }
    public static int rotatedSortedArray(int numbers[], int target){
        int st = 0, end = numbers.length-1;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(numbers[mid] == target){
                return mid;
            }
            if(numbers[st] <= numbers[mid]){
                if(numbers[st] <= target && target <= numbers[mid]){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }else{
                if(numbers[mid] <= target && target <= numbers[end]){
                    st = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
