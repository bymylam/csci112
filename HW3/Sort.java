import java.util.*;
public class Sort {
    //FIELD
    int[] arr;

    //CONSTRUCTOR
    public Sort(int[] arr) {
        this.arr = arr;
    }

    //BEHAVIOR
    public static void bubbleSort(int[] arr){
        int maxID; //right-most position in unsorted portion of array
        int index;
//decrease the right-most position as sorted portion grows
        for (maxID = arr.length - 1; maxID > 0; maxID--){
//Walk through unsorted portion of array to compare pairs
            for (index = 0; index < maxID; index++){
//Check if pair of values need to swap
                if (arr[index] > arr[index + 1]) {
                    //swap elements
                    int temp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort Array: " + Arrays.toString(arr));
//        return arr;
    }
    public static void bubbleSortShortCircuit(int[] arr){
        boolean madeASwap = true; //This will be part of the loop condition
        for (int maxID = arr.length - 1; maxID > 0 && madeASwap; maxID--){
            madeASwap = false; //No swaps have occurred yet on this pass
            for(int index = 0; index < maxID; index++) {
                if(arr[index] > arr[index+1]) {
                    int temp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = temp;
                    madeASwap = true;
                }
            }
        }
        System.out.println("Bubble Sort Short Circuit: " + Arrays.toString(arr));
//        return arr;
    }
    public static void selectionSort(int arr[]){
        int minIndex, minValue;
        for (int start = 0; start < (arr.length - 1); start++){
            minIndex = start;
            minValue = arr[start];
            for (int index = start + 1; index < arr.length; index++){
                if (arr[index] < minValue){
                    minValue = arr[index];
                    minIndex = index;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[start];
            arr[start] = temp;
        }
        System.out.println("Selection Sort Array: " + Arrays.toString(arr));
//        return arr;
    }
}
