package HW4;

public class SumTheFirstNNum {
    public static int recursiveSumFromN(int n) {
        if (n == 0) { return 0; }
        return n + recursiveSumFromN(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Sum from 1 to 10: " + recursiveSumFromN(10));
    }
}
