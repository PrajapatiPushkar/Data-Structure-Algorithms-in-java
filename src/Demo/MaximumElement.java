package Demo;

import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {

//        System.out.println("Please enter your Array");
        int[] arr = {1,5,3,6,8,4};
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
           if (arr[i] > ans){
               ans = arr[i];
           }
        }
        System.out.println("maximum element is " + ans);


    }
}
