package DSASTRIVER.array;
import java.util.Scanner;

public class shiftzero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] ar = new int[n];
        int p = 0;

        System.out.println("Enter Elements in array:");
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();

        // Move non-zero elements forward
        for (int i = 0; i < n; i++) {
            if (ar[i] != 0) {
                int temp = ar[i];
                ar[i] = ar[p];
                ar[p] = temp;
                p++;
            }
        }

        System.out.println("Final array:");
        for (int i = 0; i < n; i++)
            System.out.print(ar[i] + "\t");

        sc.close();
    }
}