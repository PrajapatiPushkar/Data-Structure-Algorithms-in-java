package ArrayByCodehelp1;

public class ArrayProblems {

    // Find the average of array elements
    public static double getAverage(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int size = arr.length;
        double avg = (double) sum / size;
        return avg;
    }

    // Multiply each element of array by 10
    public static int[] multiplyBy10(int[] arr) {
        int size = arr.length;
        int newArray[] = new int[size];

        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }

        return newArray;
    }

    // Search for an element in an Array {Linear search}
    public static boolean findTarget(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    // Find the maximum element in an array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
//            max = Math.max(max,arr[i]);
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Return sum of +ve and -ve numbers
    public static int[] getPosNegSum(int[] arr) {
        int posSum = 0;
        int negSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                //  num is positive
                posSum = posSum + arr[i];
            } else {
                //  num is negative
                negSum = negSum + arr[i];
            }
        }
        int[] ans = {posSum, negSum};
        return ans;
    }

    //Count the number of Zeroes and Ones
    public static int[] getZeroOneCount(int[] arr) {
        int zeroCount = 0;
        int OneCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else {
                //arr[i] = 1
                OneCount++;
            }
        }
        int[] ans  = {zeroCount, OneCount};
        return ans;
    }

    //Find first unsorted Element in Array
    public static int getUnsortedElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i+1] <= arr[i]) {
                return arr[i+1];
            }
        }
        return -1;
    }

    // Swap Alternate Element in an Array
    public static int[] getSwapElement(int[] arr) {
        for (int i = 0; i < arr.length - 1; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }

    // Print Array intersection element
    public static void getIntersectionElement(int[] arr1, int[] arr2) {
       for (int i = 0; i < arr1.length; i++) {
           for (int j = 0; j < arr2.length; j++) {
               if (arr1[i] == arr2[j]) {
                   System.out.print(arr1[i] + " ");
                   arr2[j] = Integer.MIN_VALUE;
                   break;
               }
           }
       }
    }

    public static void main(String[] args) {
//        int[] arr = {2,3,4,5};
//        System.out.println(getAverage(arr));


//        int[] arr = {2,3,4,5};
//        int[] ans = multiplyBy10(arr);
//        System.out.println("printing ans array: ");
//        for (int i : ans) {
//            System.out.println(i);
//        }

//        int[] arr = {1,2,3,4,5,6,7,8};
//        boolean ans = findTarget(arr, 90);
//        System.out.println(ans);

//        int[] arr = {1,2,3,4,5,6,7,8};
//        System.out.println(findMax(arr));

//        int[] arr = {2,-3,-5,-7,9};
//        int[] ans = getPosNegSum(arr);
//        System.out.println("Positive sum = " + ans[0]);
//        System.out.println("Negative sum = " + ans[1]);

//        int[] arr = {0,1,1,1,1,0};
//        int[] ans = getZeroOneCount(arr);
//        System.out.println("ZeroCount = " + ans[0]);
//        System.out.println("OneCount = " + ans[1]);

//        int[] arr = {1,2,5,4,9};
//        System.out.println(getUnsortedElement(arr));

//        int[] ans = {1,2,3,4,5,6};
//        int[] result = getSwapElement(ans);
//        for(int num : result) {
//            System.out.print( num + " ");
//        }

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {2,2,3,4};
        getIntersectionElement(arr1,arr2);
    }
}
