package DSASTRIVER.array;
import java.util.*;
public class largestelement {
    static void main() {
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter Elements in array:");
        int[] ar = new int[n];

        for (int i = 0; i <n ; i++)
            ar[i]=sc.nextInt();

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(largest<ar[i])
                largest=ar[i];
        }


        System.out.println("Largest Element is:" + largest);



    }

}
