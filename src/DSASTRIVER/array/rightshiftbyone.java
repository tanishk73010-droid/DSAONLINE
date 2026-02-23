package DSASTRIVER.array;

import java.util.Scanner;

public class rightshiftbyone {

    void rev(int ar[],int l,int h)
    {
        for (int i = l; i<h+1; i++) {
            int temp = ar[i];
            ar[i]=ar[h];
            ar[h]=temp;
            h--;
        }
    }
    static void main() {
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter Elements in array:");
        int[] ar = new int[n];

        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();

        System.out.println("Enter postion to rotate");
        int k =sc.nextInt();

        rightshiftbyone ob = new rightshiftbyone();
        ob.rev(ar, n-k, n-1);
        ob.rev(ar, 0, n-k-1);
        ob.rev(ar, 0, n-1 );


        System.out.println("Revered Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + "\t");

        }

    }}





