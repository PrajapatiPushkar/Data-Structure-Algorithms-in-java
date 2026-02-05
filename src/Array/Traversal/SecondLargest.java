package Array.Traversal;

import java.util.Scanner;

/**
 * Find the second largest element in the given array.
 */

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int n = sc.nextInt();

        System.out.print("enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large)
                large = arr[i];

        }

        int secLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secLarge && arr[i] != large)
                secLarge = arr[i];

        }

        System.out.println(large);
        System.out.println(secLarge);
    }


}
