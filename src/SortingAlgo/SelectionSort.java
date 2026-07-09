package SortingAlgo;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
    }
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {          // increasing order
//                if(arr[minPos] < arr[j])        // decreasing order
                    minPos = j;
                }
//            }
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
