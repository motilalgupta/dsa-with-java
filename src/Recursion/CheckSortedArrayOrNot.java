package Recursion;

public class CheckSortedArrayOrNot {
    static void main() {
        int arr[] = {1,2,6,4,5};

        if(isSorted(arr,0)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }

    }
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

}
