package Array.Traversal;

import java.util.Scanner;

/***
 * Find the maximum value out of all the elements in the array.
 */

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] > max) max = arr[i];
        }
        System.out.println(max);
    }
}
