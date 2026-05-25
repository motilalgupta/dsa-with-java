package ArraysPart1;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
         reverseArray(arr);
         for(int i = 0; i<=arr.length-1; i++){
             System.out.print(arr[i]+" ");
         }
    }
    public static void reverseArray(int arr[]){
        int start = 0, end = arr.length-1;
        while (start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}
