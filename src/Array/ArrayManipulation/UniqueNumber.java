package Array.ArrayManipulation;

import java.util.Scanner;

/**
 * Find the unique number in a given Array where all the elements are being
 * repeated twice with one value being unique.
 */

public class UniqueNumber {

    static int uniqueNum(int[] arr){
        int n = arr.length;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements of the array: ");
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The unique elements in the array is: " + uniqueNum(arr ));
    }
}
