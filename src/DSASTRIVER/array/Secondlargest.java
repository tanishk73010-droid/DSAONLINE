package DSASTRIVER.array;

import java.util.Scanner;

public class Secondlargest {
        static void main() {
            System.out.println("Enter the size of array:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println("Enter Elements in array:");
            int[] ar = new int[n];

            for (int i = 0; i <n ; i++)
                ar[i]=sc.nextInt();

            int largest = Integer.MIN_VALUE;
            int seclargest = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if(largest<ar[i])
                {
                    seclargest=largest;
                    largest=ar[i];}

                else if (seclargest<ar[i]&&ar[i]!=largest)
                    seclargest=ar[i];
            }
if(seclargest==Integer.MIN_VALUE)
    System.out.println("-1");
else
    System.out.println(" Second Largest Element is:" + seclargest);



        }

    }


