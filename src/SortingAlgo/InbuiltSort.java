package SortingAlgo;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String[] args) {
        Integer arr[] = {5,4,1,3,2};
//        Arrays.sort(arr);
//        Arrays.sort(arr,0,3);

//        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr,0,3, Collections.reverseOrder());

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
