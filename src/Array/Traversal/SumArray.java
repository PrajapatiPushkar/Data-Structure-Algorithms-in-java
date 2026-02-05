package Array.Traversal;

import java.util.Scanner;

/***
 * Calculate the sum of all the elements in the given array.
 */

public class SumArray {

//
//    //my code
//    static int Sum(int[] arr, int n){
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            count = count + arr[i];
//
//        }
//        return count;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        System.out.print("sum of all element of array is: " + Sum(arr, n));

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of all elements of Array is: " + sum);

    }
}
