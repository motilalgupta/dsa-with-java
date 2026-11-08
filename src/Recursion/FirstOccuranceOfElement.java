package Recursion;

class FirstOccurrenceOfElement {

    public static int firstOccurrence(int arr[], int key, int index) {

        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == key) {
            return index;
        }

        return firstOccurrence(arr, key, index + 1);
    }

    public static void main(String[] args) {

        int arr[] = {4, 2, 7, 2, 9};
        int key = 2;

        int result = firstOccurrence(arr, key, 0);

        System.out.println("First occurrence at index: " + result);
    }
}
