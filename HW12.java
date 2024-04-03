import java.util.*;
    
public class MergeSortNumComp {
    public static void bubbleSort(int arr[]){
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
    }
    
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[100];
        int[] arr3 = new int[5000];
        
        populateArray(arr1);
        populateArray(arr2);
        populateArray(arr3);
        
        int numCompArr1 = mergeSort(arr1, 0, arr1.length-1);
        int numCompArr2 = mergeSort(arr2, 0, arr2.length-1);
        int numCompArr3 = mergeSort(arr3, 0, arr3.length-1);
        
        System.out.println("# Elements: " + arr1.length + ", # Comparisons: " + numCompArr1);
        System.out.println("# Elements: " + arr2.length + ", # Comparisons: " + numCompArr2);
        System.out.println("# Elements: " + arr3.length + ", # Comparisons: " + numCompArr3);
    }
    //Add mergeSort, merge, and populateArray here
    }
}
