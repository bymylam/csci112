public class BinarySearch {
    //BINARY SEARCH
    public static void binarySearch(int[] array, int value) {
        int first = 0,
                last = array.length - 1, //-1 because we will handle it in index
                middle,
                position = -1,
                pass = 0;
        boolean found = false;

        while ((first < last) && !found) {
            pass++;
            middle = (first + last)/2;
            if (array[middle] == value) {
                found = true;
                position = middle;

//                System.out.println("Pass#" + pass);
//                System.out.println("[" + array[middle] + "]");
//                System.out.println(value + " is found at the index " + position + " on the pass#" + pass);

            } else if (array[middle] > value) {
                last = middle - 1;
                System.out.println("Pass#" + pass);
                System.out.print("[" + array[0]);
                for (int i = 1; i <= last; i++) {
                    System.out.print("," + array[i]);
                }
                System.out.println("]");
            } else if (array[middle] < value) {
                first = middle + 1;
                System.out.println("Pass#" + pass);
                System.out.print("[" + array[first]);
                for (int i = first+1; i <= last; i++) {
                    System.out.print("," + array[i]);
                }
                System.out.println("]");
            } else { System.out.println(value + " is not found after " + pass + " passes."); }
        }
    }
    //PRINT ARRAY
    public static String printArray(int[] array) {
        String result = "";
        if (array.length >= 1) {
            result += "[" + array[0];
            for (int i = 1; i < array.length; i++) {
                result += "," + array[i];
            }
            result += "]";
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,11,17,23,29,34,38,51,57,63,75,83,90};
        System.out.println("The original array: " + printArray(arr));
        binarySearch(arr,90);
    }
}
