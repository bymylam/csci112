package Recursion;

import java.util.*;
public class SomeVitalRecursiveMethod {
    //RECURSIVE FACTORIAL METHOD
    public static int factorial(int n) {
        //base case
        if (n == 0) { return 1; }
        else { return n * factorial(n-1); }
    }

    //RECURSIVE FIBONACCI METHOD
    public static int fibonacci(int n) {
        if (n == 0) { return 0; } //base case
        else if (n == 1) { return 1; } // base case
        else { return fibonacci(n-1) + fibonacci(n-2); }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scan.nextInt();

        //for FACTORIAL
        int fact = factorial(num);
        System.out.println("The factorial of " + num + " is " + fact);

        //for FIBONACCI
        int fib = fibonacci(num);
        System.out.println("The fibonacci of " + num + " is " + fib);
    }
}
