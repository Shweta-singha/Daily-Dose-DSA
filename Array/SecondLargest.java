package Arrays;

import java.util.Scanner;

public class SecondLargest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Edge Case 1: Array size < 2
        if(n < 2)
        {
            System.out.println("Invalid: Need at least 2 elements");
            return;
        }

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        int maxIndex = -1;
        int smaxIndex = -1;

        for(int i = 0; i < n; i++)
        {
            // Case 1: New maximum found
            if(arr[i] > max)
            {
                smax = max;
                smaxIndex = maxIndex;

                max = arr[i];
                maxIndex = i;
            }
            // Case 2: Valid second max candidate
            else if(arr[i] < max && arr[i] > smax)
            {
                smax = arr[i];
                smaxIndex = i;
            }
        }

        // Edge Case 2: No second max
        System.out.println("Max = " + max + " at index " + maxIndex);

        if(smaxIndex == -1)
        {
            System.out.println("No second maximum element exists");
        }
        else
        {
            System.out.println("Max = " + max + " at index " + maxIndex);
            System.out.println("Second Max = " + smax + " at index " + smaxIndex);
        }

        sc.close();
    }
}