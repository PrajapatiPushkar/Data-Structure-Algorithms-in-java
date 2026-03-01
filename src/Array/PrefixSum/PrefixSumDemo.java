package Array.PrefixSum;

import java.util.Scanner;

public class PrefixSumDemo {

    public static void printArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];

        pref[0] = arr[0];

        for (int i = 1; i < n; i++){
            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the element of the Array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array: ");
        printArr(arr);

        int[] pref = makePrefixSumArray(arr);
        printArr(pref);

    }
}
