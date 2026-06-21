package ArrayByCodehelp1;

public class Practice {
   public static int[] getPosNegSum(int[] arr) {
       int posSum = 0;
       int negSum = 0;

       for (int i = 0; i < arr.length; i++) {
           if (arr[i] > 0) {
               // num is positive
               posSum = posSum + arr[i];
           } else {
               // num is negative
               negSum = negSum + arr[i];
           }
       }
       int[] ans = {posSum, negSum};
       return ans;
   }
   public static int[] getZeroOneCount(int[] arr) {
       int zeroCount = 0;
       int oneCount = 0;

       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == 0) {
               zeroCount++;
           } else {
               //arr[i] = 1
               oneCount++;
           }
       }
       int[] ans = {zeroCount, oneCount};
       return ans;
   }

    public static void main(String[] args) {
//        int[] arr = {2, -3, -5, -7, 9};
//        int[] ans = getPosNegSum(arr);
//        System.out.println("Positive Sum = " + ans[0]);
//        System.out.println("Positive Sum = " + ans[1]);

        int[] arr = {0,1,1,0,1,1,1};
        int[] ans = getZeroOneCount(arr);
        System.out.println("ZeroCount = " + ans[0]);
        System.out.println("OneCount = " + ans[1]);
    }
}
