package Array.Array2D;

import java.util.Scanner;

public class MultiDimensionalArray {

    static void printArr(int[][] arr){
        for (int i = 0; i < arr.length; i++){ // row
//            System.out.println(arr[i]);
            for (int j = 0; j < arr[i].length; j++) { // column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of column: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c]; // total = r * c

        System.out.println("Enter " + r*c + " element");
        for (int i = 0; i < r; i++) { // row
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


//        int[][] arr2 = {{1, 2, 3},
//                        {4, 5, 6},
//                        { 8, 1, 1 }
//        };


        printArr(arr);
    }
}
