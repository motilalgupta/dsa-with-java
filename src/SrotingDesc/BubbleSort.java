package SrotingDesc;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,4,2,1,3};
        bubbleSort(arr);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
    public static void bubbleSort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
