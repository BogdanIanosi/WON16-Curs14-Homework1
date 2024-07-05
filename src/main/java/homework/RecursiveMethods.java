package homework;

public class RecursiveMethods {

    // 1. Sum of first n integer numbers
    public int sumFirstNIntegers(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumFirstNIntegers(n - 1);
    }

    // 2. Sum of first n EVEN integers
    public int sumFirstNEvenIntegers(int n) {
        if (n <= 0) {
            return 0;
        }
        return 2 * n + sumFirstNEvenIntegers(n - 1);
    }

    // 3. Palindrome - Recursive string reverse
    public String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // 3. Palindrome - Recursive check of first and last letter
    public boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    // 4. Sum of digits for a number
    public int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumOfDigits(num / 10);
    }

    // 5. Fibonacci array
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

