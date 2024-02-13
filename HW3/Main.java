import java.util.*; //random, scanner, arrays

public class Main {
    public static void printArray(int[] arr) {
        if (arr.length >= 1) {
            System.out.print("[ " + arr[0]);
            for (int i = 1; i < arr.length; i++)
                System.out.print(", " + arr[i]);
            System.out.println(" ]");
        }
    }

    public static void main(String[] args) {
        //1 - generate an array of randomized numbers
        int arrLength = 10;
        Random rand = new Random();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = rand.nextInt(20);
            System.out.println(arr[i]);
        }
        //2 - print the array
        printArray(arr);
//        System.out.println(Arrays.toString(arr));
        //using arrays library

        //3 - sort the array
        //4 - print the array again, now that it has been sorted
        Sort arrSorted = new Sort(arr);
        arrSorted.bubbleSort(arr);
        arrSorted.bubbleSortShortCircuit(arr);
        arrSorted.selectionSort(arr);

        //5 - ask the user for a search value
        Scanner scan = new Scanner(System.in);
        System.out.print("\nSearch value: ");
        int responseSearchValue = scan.nextInt();

        //6 - search the array using both linear and binary search
        Search arrSearched = new Search(arr, responseSearchValue);
        //linear search
        int arrLinear = arrSearched.linearSearch(arr, responseSearchValue);
        if (arrLinear != -1) {
            System.out.println("Search value by linear was found at index: " + arrLinear);
        } else { System.out.println("The linear search value was not found!"); }

        //binary search
        int arrBinary = arrSearched.binarySearch(arr, responseSearchValue);
        if (arrBinary != -1) {
            System.out.println("Search value by binary was found at index: " + arrBinary);
        } else { System.out.println("The binary search value was not found!"); }
    }
}
