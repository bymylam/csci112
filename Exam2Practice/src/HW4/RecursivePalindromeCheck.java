package HW4;

public class RecursivePalindromeCheck {
    public static boolean palindrome(String input) {
        if ((input.length() == 1) || (input.length() == 0)) { return true; }
        return input.charAt(0) == input.charAt(input.length()-1);
    }

    public static void main(String[] args) {
        String hannah = "hannah";
        String bob = "bob";
        String hello = "hello";
//using a conditional operator
        String result = palindrome(hannah) ? "" : "not ";
        System.out.println(hannah + " is " + result + "a palindrome.");
        result = palindrome(bob) ? "" : "not";
        System.out.println(bob + " is " + result + "a palindrome.");
        result = palindrome(hello) ? "" : "not";
        System.out.println(hello + " is " + result + " a palindrome.");
    }
}
