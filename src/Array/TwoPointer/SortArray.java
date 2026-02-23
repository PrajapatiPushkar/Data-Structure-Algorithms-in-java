package Array.TwoPointer;

import java.util.Scanner;

public class SortArray {

    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void sortZeroAndOnes(int[] arr){
        int n = arr.length;
        int zeroes = 0;
        //count number of zeroes
        for (int i = 0; i < n; i++){
            if (arr[i] == 0){
                zeroes++;
            }
        }

        // 0 to zeroes - 1: 0, zeroes to n - 1 : 1
        for (int i = 0; i < n; i++){
            if (i < zeroes){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter the element of the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        printArray(arr);
        sortZeroAndOnes(arr);

        System.out.print("Sorted array");
        printArray(arr);


    }
}
