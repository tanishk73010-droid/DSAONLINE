package DSASTRIVER;

import java.util.*;

public class patterns {

    // Pattern 1
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // Pattern 2
    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // Pattern 3
    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }

    // Pattern 4
    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) System.out.print(i + " ");
            System.out.println();
        }
    }

    // Pattern 5
    static void pattern5(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // Pattern 6
    static void pattern6(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }

    // Pattern 7 (Pyramid)
    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++) System.out.print("*");
            System.out.println();
        }
    }

    // Pattern 8 (Reverse Pyramid)
    static void pattern8(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++) System.out.print("*");
            System.out.println();
        }
    }

    // Pattern 9 (Diamond)
    static void pattern9(int n) {
        pattern7(n);
        pattern8(n);
    }

    // Pattern 10
    static void pattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i <= n ? i : 2 * n - i;
            for (int j = 0; j < stars; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // Pattern 11
    static void pattern11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            start = (i % 2 == 0) ? 1 : 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    // Pattern 12
    static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j);
            for (int j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
            for (int j = i; j >= 1; j--) System.out.print(j);
            System.out.println();
        }
    }

    // Pattern 13
    static void pattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(num++ + " ");
            System.out.println();
        }
    }

    // Pattern 14
    static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++)
                System.out.print(ch + " ");
            System.out.println();
        }
    }

    // Pattern 15
    static void pattern15(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (char ch = 'A'; ch <= 'A' + i; ch++)
                System.out.print(ch + " ");
            System.out.println();
        }
    }

    // Pattern 16
    static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++)
                System.out.print(ch + " ");
            System.out.println();
        }
    }

    // Pattern 17 (Alphabet Pyramid)
    static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
            char ch = 'A';
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j < i) ch++;
                else ch--;
            }
            System.out.println();
        }
    }

    // Pattern 18
    static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('A' + n - i - 1); ch <= 'A' + n - 1; ch++)
                System.out.print(ch + " ");
            System.out.println();
        }
    }

    // Pattern 19 (Hollow Diamond)
    static void pattern19(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) System.out.print("*");
            for (int j = 0; j < 2 * i; j++) System.out.print(" ");
            for (int j = 0; j < n - i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) System.out.print("*");
            for (int j = 0; j < 2 * (n - i); j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
    }

    // Pattern 20 (Butterfly)
    static void pattern20(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) System.out.print("*");
            for (int j = 0; j < 2 * (n - i); j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) System.out.print("*");
            for (int j = 0; j < 2 * (n - i); j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
    }

    // Pattern 21 (Hollow Square)
    static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Pattern 22 (Number Square)
    static void pattern22(int n) {
        int size = 2 * n - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int top = i;
                int left = j;
                int right = size - j - 1;
                int bottom = size - i - 1;
                int val = n - Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter pattern number (1-22): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                pattern1(n);
                break;
            case 2:
                pattern2(n);
                break;
            case 3:
                pattern3(n);
                break;
            case 4:
                pattern4(n);
                break;
            case 5:
                pattern5(n);
                break;
            case 6:
                pattern6(n);
                break;
            case 7:
                pattern7(n);
                break;
            case 8:
                pattern8(n);
                break;
            case 9:
                pattern9(n);
                break;
            case 10:
                pattern10(n);
                break;
            case 11:
                pattern11(n);
                break;
            case 12:
                pattern12(n);
                break;
            case 13:
                pattern13(n);
                break;
            case 14:
                pattern14(n);
                break;
            case 15:
                pattern15(n);
                break;
            case 16:
                pattern16(n);
                break;
            case 17:
                pattern17(n);
                break;
            case 18:
                pattern18(n);
                break;
            case 19:
                pattern19(n);
                break;
            case 20:
                pattern20(n);
                break;
            case 21:
                pattern21(n);
                break;
            case 22:
                pattern22(n);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
