package HW4;

public class PrintArrayRecursively {
    //OPTION 1: Print the first element, then the remaining elements
    public static void recursivePrintOption1(int[] arr, int start, int end) {
        if (start < end) {
            System.out.print(arr[start] + " ");
            recursivePrintOption1(arr, start+1, end);
        }
    }
    //OPTION 2: Print the first half then the second half
    public static void recursivePrintOption2(int[] arr, int start, int end) {
        if (start == end) {
            System.out.print(arr[start] + " ");
        } else if (start < end) {
            int mid = (start + end)/2;
            recursivePrintOption2(arr, start, mid);
            recursivePrintOption2(arr, mid+1, end);
        }
    }

    public static void main(String[] agrs) {
        int[] arr = { 3, 5, 1, 7, 9, 0, 2};
        System.out.println("Option #1:");
        recursivePrintOption1(arr, 0, arr.length);
        System.out.println("\nOption #2:");
        recursivePrintOption2(arr, 0, arr.length-1);
    }
}
