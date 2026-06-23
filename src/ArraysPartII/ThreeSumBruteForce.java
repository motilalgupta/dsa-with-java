package ArraysPartII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumBruteForce {
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println("Triplets are: "+lists);
    }
    public static List<List<Integer>> threeSum (int nums[]){
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i<nums.length-2; i++){
            for(int j = i+1; j<nums.length-1; j++){
                for(int k = j+1; k<nums.length; k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> triplets = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                        result.add(triplets);
                    }
                }
            }
        }
        return result;
    }
}
