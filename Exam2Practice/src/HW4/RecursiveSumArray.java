package HW4;

public class RecursiveSumArray {
    //OPTION 1: Sum the first element with the remaining elements
    public static int recursiveSumOption1(int[] arr, int start, int end) {
        int sum = 0;
        if (start < end) {
            sum = arr[start] + recursiveSumOption1(arr,start+1,end);
        }
        return sum;
    }

    //OPTION 2: Sum the first half of the array with the second half
    public static int recursiveSumOption2(int[] arr, int start, int end) {
        int sum = 0;
        if (start == end) {
            sum = arr[start];
        } else if (start < end) {
            int mid = (start + end)/2;
            sum = recursiveSumOption2(arr, start, mid) + recursiveSumOption2(arr, mid+1, end);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,1,7,9,0,2};
        System.out.print("OPTION 1: ");
        System.out.println(recursiveSumOption1(arr,0,arr.length));
        System.out.println("OPTION 2: " + recursiveSumOption2(arr,0,arr.length-1));
    }
}
