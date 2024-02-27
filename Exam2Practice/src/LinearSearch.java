public class LinearSearch {
    //LINEAR SEARCH
    public static void linearSearch(int[] array, int value) {
        int index = 0, pass = 0;
        int position = -1;
        boolean found = false;

        while ((index < array.length) && !found) {
            pass++;
            if (array[index] == value) {
                found = true;
                position = index;
                //if the datatype is int, then dont need to print out the position of the value
                System.out.println(value + " is found at index " + position + " on the pass #" + pass);
            }
            index++;
        }
        //"return position" when the datatype is int
        if (!found) { System.out.println(value + " is not found after " + pass + " passes."); }
    }
    //PRINT ARRAY
    public static void printArray(int[] array) {
        if (array.length >= 1) {
            System.out.print("[" + array[0]);
            for (int i = 1; i < array.length; i++) {
                System.out.print("," + array[i]);
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int[] arr = {17,23,5,11,2,29,3};
        printArray(arr);
        linearSearch(arr, 3);
    }
}