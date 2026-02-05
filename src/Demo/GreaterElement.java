package Demo;

import java.util.Scanner;

/***
 * Count the number of elements strictly greater than value x.
 */

public class GreaterElement {
    static int GreaterNUm(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x > arr[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of arrays: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the X element: ");
        int x  =sc.nextInt();

        System.out.println("Count of X: " + GreaterNUm(arr, x));
    }

}
