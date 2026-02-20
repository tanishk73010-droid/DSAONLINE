package DSASTRIVER;

import java.util.Scanner;

public class assingmentallques {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------------- Question 1 ----------------
        // Take an array and print elements
        System.out.println("Q1: Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // ---------------- Question 2 ----------------
        // Largest element
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("\nLargest element = " + max);

        // ---------------- Question 3 ----------------
        // Count even numbers
        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even elements count = " + evenCount);

        // ---------------- Question 4 ----------------
        // 3×3 Matrix input
        int[][] matrix = new int[3][3];
        System.out.println("\nQ4: Enter 9 elements for 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // ---------------- Question 5 ----------------
        // Print matrix
        System.out.println("Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // ---------------- Question 6 ----------------
        // Main diagonal elements
        System.out.println("Main diagonal elements:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        // ---------------- Question 7 ----------------
        // Sum of all elements
        int totalSum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                totalSum += matrix[i][j];
            }
        }
        System.out.println("\nTotal sum = " + totalSum);

        // ---------------- Question 8 ----------------
        // Row-wise sum
        System.out.println("Row-wise Sum:");
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum = " + rowSum);
        }

        // ---------------- Question 9 ----------------
        // Column-wise sum
        System.out.println("Column-wise Sum:");
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + " sum = " + colSum);
        }

        // ---------------- Question 10 ----------------
        // Name and Year input
        sc.nextLine(); // buffer clear

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your year of study:");
        String year = sc.nextLine();

        System.out.println("My name is " + name + " and I am in " + year + " year.");

        // ---------------- Question 11 ----------------
        // Reverse array
        System.out.println("Reversed array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
