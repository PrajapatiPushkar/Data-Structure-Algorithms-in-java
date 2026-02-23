package Array.TwoPointer;

import java.util.Scanner;

public class EvenOddSort {
    public static void printArr(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortOddEven(int[] arr){
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right){
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0){
                left++;
            }
            if (arr[right] % 2 != 0){
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the element of the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        printArr(arr);
        sortOddEven(arr);

        System.out.print("Original array: ");
        printArr(arr);
    }
}
