import java.util.*; //random & scanner

public class Main {
    public static void main(String[] args) {
        //1 - generate an array of randomized numbers
        int arrLength = 10;
        Random rand = new Random();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = rand.nextInt(20);
//            System.out.println(arr[i]);
        }
        //2 - print the array
        System.out.println(Arrays.toString(arr));
        //OR arrSorted.printArray(arr);

        //3 - sort the array
        Sort arrSorted = new Sort(arr);
        arrSorted.bubbleSort(arr);
        arrSorted.bubbleSortShortCircuit(arr);
        arrSorted.selectionSort(arr);
    }
}