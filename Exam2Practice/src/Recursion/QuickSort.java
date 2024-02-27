package Recursion;

public class QuickSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int start, int end) {
        //the pivot element is taken to be the element at the start of the subrange to be partitioned
        int pivotValue = arr[start];
        int pivotPosition = start;

        //rearrange the rest of the array elements to partition the subrange from start to end
        for (int pos = start+1; pos <= end; pos++) {
            if (arr[pos] < pivotValue) {
                //arr[pos] is the "current" item
                //swap the current item with the item to the right of the pivot element
                swap(arr, pivotPosition+1, pos);

                //swap the current item with the pivot element
                swap(arr, pivotPosition,pivotPosition+1);

                //adjust the pivot position is stays with the pivot element
                pivotPosition++;
            }
        }
        return pivotPosition;
    }
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            //partition the array and get the pivot point
            int pivot = partition(arr, start, end);

            //sort the portion before the pivot point
            quickSort(arr, start, pivot);

            //sort the portion after the pivot point
            quickSort(arr, pivot+1, end);
        }
    }
    //PRINT ARRAY
    public static void printArray(int[] arr) {
        if(arr.length >= 1) {
            System.out.print("[" + arr[0]);
            for (int i = 1; i < arr.length; i++) {
                System.out.print("," + arr[i]);
            }
            System.out.println("]");
        }
    }
    //MAIN
    public static void main(String[] args) {
        int[] arr = {17, 53, 9, 2, 30, 1, 82, 64, 26, 5};
// Print unsorted array
        printArray(arr);
//Sort the array.
//Start is 0 and End is last index in array
        quickSort(arr, 0, arr.length-1);
// Print the sorted array
        printArray(arr);
    }
}
