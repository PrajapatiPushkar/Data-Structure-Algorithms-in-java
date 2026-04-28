package ArrayByCodehelp1;

import java.util.HashMap;

public class ArrayManipulationProblem {

    // Print reverse array
    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            // i ko aage badhao
            i++;
            // j ko piche lao
            j--;
        }
        // now array has been reversed
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    // Shift array elements by one position
    public static void shiftBy1(int[] arr) {
        // Step1: store last wale ki value
        int n = arr.length;
        int temp = arr[n -1];
        // step2: Shift all values of array
        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        // step3: temp ki value ko 0 index per copy
        arr[0] = temp;
    }

    // Print extreme elements in an alternate manner
    public static void printAlternate(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (i == j){
                System.out.println(arr[i]);
                return;
            } else {
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }

    // finding the mode of the array
    public static int getMode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num,0) + 1);
        }

//        for (int i : freq.keySet()) {
//            // i -> will represent key
//            System.out.println(i + " -> " + freq.get(i));
//        }

        int maxFreq = -1;
        int maxFreqWaliKey = -1;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyKiFrequency = freq.get(key);
            if (currentKeyKiFrequency > maxFreq) {
                // mujhe naya max mil gya
                maxFreq = currentKeyKiFrequency;
                maxFreqWaliKey = currentKey;
            }
        }
        // jab loop se bahar aaoge toh max freq wali key ready hogi
        return maxFreqWaliKey;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,2,3,3,3,3,4,4,4,4,5,5};
//        reverseArray(arr);

//        shiftBy1(arr);
//        for (int a : arr) {
//            System.out.print(a + " ");
//        }
//        System.out.println();

//        printAlternate(arr);

        int ans = getMode(arr);
        System.out.println(ans);

    }
}
