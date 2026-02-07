package Array.TargetSum;

import java.util.Scanner;

/***
 * Find the total number of pairs in the Array whose sum is equal to the given values x.
 */

public class PairSum {
    static int pairSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) { //first number
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your array size: ");
        int n = sc.nextInt();

        System.out.print("enter the element of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        System.out.println(pairSum(arr, target));

    }
}
