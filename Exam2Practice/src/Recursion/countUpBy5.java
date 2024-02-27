package Recursion;

public class countUpBy5 {
    public static void countUpBy5(int num) {
        while( num < 100 ) {
            System.out.print(num + " ");
            num += 5;
        }
        System.out.println("Done!");
    }
    public static void countUpBy5Recursive(int num) {
        if (num < 100) { //base case in order to stop the recursion running non-stop
            System.out.print(num + " ");
            countUpBy5Recursive(num += 5);
        } else { System.out.println("Done!"); }
    }
    public static void main(String[] args) {
        System.out.println("Count up by 5: ");
        countUpBy5(22);
        System.out.println("\nCount up by 5 recursively: ");
        countUpBy5Recursive(22);
    }
}
