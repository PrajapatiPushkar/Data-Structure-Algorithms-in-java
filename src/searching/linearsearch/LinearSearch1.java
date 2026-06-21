package searching.linearsearch;

public class LinearSearch1 {

    public static void linearSearch(int[] arr, int target) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                break;
            }
        }
        if (ans == -1) {
            System.out.println("Elements is not present in the array");
        } else {
            System.out.println("Found element at Position: " + ans);
        }

    }

    public static void linearSearchMultiple(int[] arr, int target) {
        int[] ans = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                ans[k] = i;
                k++;
            }
        }
        if (k == 0) {
            System.out.println("Element is not present in the array");
        } else {
            for (int i =0; i < k; i++) {
                System.out.println("Found element at position: " + ans[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,4,1,7,2,9};
//        linearSearch(arr,1);
        linearSearchMultiple(arr,4);
    }
}
