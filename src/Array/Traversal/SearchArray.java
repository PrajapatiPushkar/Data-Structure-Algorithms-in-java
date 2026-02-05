package Array.Traversal;

import java.util.Scanner;

/**
 * Find the element X in the array. Take array and X as input
 */

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter the element of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("enter the element that you are find: ");
        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Element are found: " + x);
            }
        }
    }
}
