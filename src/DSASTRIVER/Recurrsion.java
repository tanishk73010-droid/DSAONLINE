package DSASTRIVER;

import java.util.*;

class Recurrsion {

    // 1. Print Name N Times
    static void printName(int i, int n) {
        if (i > n) return;
        System.out.println("Tanishk");
        printName(i + 1, n);
    }

    // 2. Print 1 to N
    static void print1toN(int i, int n) {
        if (i > n) return;
        System.out.print(i + " ");
        print1toN(i + 1, n);
    }

    // 3. Print N to 1
    static void printNto1(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printNto1(n - 1);
    }

    // 4. Sum of N numbers
    static int sumN(int n) {
        if (n == 0) return 0;
        return n + sumN(n - 1);
    }

    // 5. Factorial
    static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    // 6. Power
    static long power(long x, int n) {
        if (n == 0) return 1;
        return x * power(x, n - 1);
    }

    // 7. Fibonacci
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 8. Count Digits
    static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }

    // 9. Parameterized Sum
    static void sumParameterized(int i, int sum) {
        if (i < 0) {
            System.out.println(sum);
            return;
        }
        sumParameterized(i - 1, sum + i);
    }

    // 10. Reverse Array (Two Pointer)
    static void reverseArray(int[] arr, int l, int r) {
        if (l >= r) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseArray(arr, l + 1, r - 1);
    }

    // 11. Reverse Array (One Pointer)
    static void reverseArray2(int[] arr, int i) {
        if (i >= arr.length / 2) return;
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        reverseArray2(arr, i + 1);
    }

    // 12. Palindrome Check
    static boolean palindrome(String s, int i) {
        if (i >= s.length() / 2) return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;
        return palindrome(s, i + 1);
    }

    // 13. Remove Character from String
    static String removeChar(String s, char c, int i) {
        if (i == s.length()) return "";
        if (s.charAt(i) == c)
            return removeChar(s, c, i + 1);
        else
            return s.charAt(i) + removeChar(s, c, i + 1);
    }

    // 14. Print All Subsequences
    static void subsequences(int i, int[] arr, List<Integer> list) {
        if (i == arr.length) {
            System.out.println(list);
            return;
        }

        // take
        list.add(arr[i]);
        subsequences(i + 1, arr, list);

        // not take
        list.remove(list.size() - 1);
        subsequences(i + 1, arr, list);
    }

    // 15. Subsequences with Sum = K
    static void subsequenceSumK(int i, int[] arr, List<Integer> list, int sum, int k) {
        if (i == arr.length) {
            if (sum == k) System.out.println(list);
            return;
        }

        list.add(arr[i]);
        subsequenceSumK(i + 1, arr, list, sum + arr[i], k);

        list.remove(list.size() - 1);
        subsequenceSumK(i + 1, arr, list, sum, k);
    }

    // 16. Count Subsequences with Sum = K
    static int countSubsequenceSumK(int i, int[] arr, int sum, int k) {
        if (i == arr.length) {
            if (sum == k) return 1;
            return 0;
        }

        int left = countSubsequenceSumK(i + 1, arr, sum + arr[i], k);
        int right = countSubsequenceSumK(i + 1, arr, sum, k);

        return left + right;
    }


    // ---------------- MAIN ----------------

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Print Name:");
        printName(1, 3);

        System.out.println("1 to N:");
        print1toN(1, n);

        System.out.println("\nFactorial:");
        System.out.println(factorial(5));

        System.out.println("Fibonacci:");
        System.out.println(fibonacci(6));

        int[] arr = {1, 2, 3};
        System.out.println("Subsequences:");
        subsequences(0, arr, new ArrayList<>());

        System.out.println("Subsequence Sum K:");
        subsequenceSumK(0, arr, new ArrayList<>(), 0, 3);

        System.out.println("Count Subsequence Sum K:");
        System.out.println(countSubsequenceSumK(0, arr, 0, 3));
    }
}
