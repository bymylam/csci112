public class Main {
    //sum all of the elements in an array recursively
    public static void sumAllElements(int[] arr, int start, int end) {
        //[1,2,3,4,5,6,7,8,9,0]
        //ex: length = 10
        if (start < (arr.length-1)) {
            end += arr[start];
            System.out.println("The " + (start+1) + "th step: " + end);
            start++;
            sumAllElements(arr, start, end);
        } else { System.out.println("Done!"); }
    }
    //print the elements of an array recursively

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        System.out.println("1-sum all of the elements in an array recursively");
        sumAllElements(arr, 0, 0);
        //the output must be 45
    }
}