package DSASTRIVER.array;
import java.util.Scanner;

public class leftrotate {

    static void reverse(int arr[], int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    static void rotateLeft(int arr[], int k) {
        int n = arr.length;
        k = k % n;   // handle k > n

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter positions to rotate: ");
        int k = sc.nextInt();

        rotateLeft(arr, k);

        System.out.println("Array after left rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
