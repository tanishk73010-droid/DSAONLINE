package DSASTRIVER.array;

import java.util.*;

public class SortedAndRoated {

    void rev(int ar[], int l, int h) {
        while (l < h) {
            int temp = ar[l];
            ar[l] = ar[h];
            ar[h] = temp;
            l++;
            h--;
        }
    }

    int sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("There is no sorted array");
                return 0;
            }
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");

        System.out.println("\nIts a sorted array");
        return 1;
    }

    public static void main(String[] args) {

        SortedAndRoated ob = new SortedAndRoated();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] ar = new int[n];

        System.out.println("Enter Elements in array:");
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();

        boolean rotated = false;

        for (int i = n - 1; i > 0; i--) {
            if (ar[i] < ar[i - 1]) {

                ob.rev(ar, i, n - 1);
                ob.rev(ar, 0, i - 1);
                ob.rev(ar, 0, n - 1);

                ob.sort(ar);

                System.out.println("Rotated times: " + (i-1));
                rotated = true;
                break;
            }
        }

        if (!rotated) {
            ob.sort(ar);
            System.out.println("Array was already sorted (0 rotations)");
        }
    }
}
