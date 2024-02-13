public class Search {
    //FIELD
    int[] arr;
    int value;

    //CONSTRUCTOR
    public Search(int[] arr, int value) {
        this.arr = arr;
        this.value = value;
    }

    //BEHAVIOR
    public static int linearSearch(int[] array, int value) {
        int index = 0; // Used as a subscript to search the array
        int position = -1; // Used to record the position of search value
        boolean found = false; // Flag to indicate if the value was found
// Initialized as false because the
// value has not been found yet
        while (index < array.length && !found) {
            if (array[index] == value) // If the value is found
            {
                found = true; // Set the flag
                position = index; // Record the value's subscript
            }
            index++; // Go to the next element
        }
        return position; // Return the position, or -1
    }
    public static int binarySearch(int[] array, int value) {
        int first = 0, // First array element
                last = array.length - 1, // Last array element
                middle, // Midpoint of search
                position = -1; // Position of search value
        boolean found = false; // Flag to indicate if the value was found
        while (!found && first <= last) {
            middle = (first + last) / 2; // Calculate midpoint
            if (array[middle] == value) // If value is found there
            {
                found = true;
                position = middle;
            }
            else if (array[middle] > value) // If value is in lower half
                last = middle - 1;
            else
                first = middle + 1; // If value is in upper half
        }
        return position;
    }
    public static void binarySearchWithPrints(int[] array, int value) {
        int first = 0, last = array.length - 1, middle, pass = 0;
        boolean found = false;
        while (!found && first <= last) {
            middle = (first + last) / 2;
            pass++;
            if (array[middle] == value) {
                found = true;
                System.out.println("Value " + value +
                        " found at index " +
                        middle + " on pass #" + pass);
            } else if (array[middle] > value)
                last = middle - 1;
            else
                first = middle + 1; }
        if(!found)
            System.out.println("Value " + value + " not found " +
                    "after " + pass + " passes.");}
}
