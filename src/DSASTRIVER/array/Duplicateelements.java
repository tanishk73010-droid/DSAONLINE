package DSASTRIVER.array;

import java.util.Scanner;

public class Duplicateelements {

    static void main() {
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter Elements in array:");
        int[] ar = new int[n];

        int k = 0;

        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();


        for (int i = 1; i < n; i++) {
            if (ar[i] != ar[k]) {
                k++;
                ar[k] = ar[i];
            }
        }
        System.out.println("No of unique Element are:" + (k + 1));
        System.out.println("Array after removing elements:");
        for (int i = 0; i < k+1; i++) {
            System.out.print(ar[i]+"\t");

        }}    }



