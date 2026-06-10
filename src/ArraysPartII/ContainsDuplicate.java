package ArraysPartII;

import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.print("Enter the Arrays element: ");
        for(int i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int res = containsDuplicate(nums);
        System.out.println("Yes contains duplicate: "+res);
    }
    public static int containsDuplicate(int nums[]){
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return 1;
                }
            }
        }
        return 0;
    }
}
