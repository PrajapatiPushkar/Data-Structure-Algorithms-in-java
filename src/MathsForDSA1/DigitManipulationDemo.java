package MathsForDSA1;

import Array.PrefixSum.PrefixSumDemo;

public class DigitManipulationDemo {

    // Find number of the digit
    public void findDigitsUsingFormula(int num) {
        if (num == 0){
            System.out.println("Number of digits: " + 1);
            return;
        }
        if (num < 0){
            num = -1 * num;
        }
        int result =  (int)Math.log10(num) + 1;
        System.out.println("Number of digits: " + result);
    }

    // Find number of the digit
    public void findDigitsUsingDivision(int num) {
        if (num == 0){
            System.out.println("Number of digits: " + 1);
            return;
        }
        if (num < 0) {
            num = -1 * num;
        }
        int result = 0;
        while (num > 0) {
            num /= 10;
            result++;
        }
        System.out.println("Number of digits: " + result);
    }

    // Add digit to end
    public void appendDigit(int num, int digit) {
        boolean isNegative = false;
        if (num < 0){
            isNegative = true;
            num = -1 * num;
        }
        int result = num * 10 + digit;
        if (isNegative){
            result = -1 * result;
        }
        System.out.println("New number is: " + result);
    }

    // Insert at front
    public void insertAtFront(int num, int digit) {
        boolean isNegative = false;
        if (num < 0){
            num = -1 * num;
            isNegative = true;
        }
        int digits = 1; // when num is 0
        if (num > 0){
            digits = (int)Math.log10(num) + 1;
        }

        int result = digit * (int)Math.pow(10, digits) + num;
        if (isNegative) {
            result = -1 * result;
        }
        System.out.println("New  number is :" + result);
    }

    // Reverse the number
    public void reverseNumber(int num) {
        int result = 0;
        boolean isNegative = false;
        if (num < 0){
            isNegative = true;
            num = -1 * num;
        }
        while (num > 0){
            int d = num % 10;
            result = result * 10 + d;
            num = num / 10;
        }
        if (isNegative){
            result = -1 * result;
        }
        System.out.println("Reverse number is: " + result);
    }

    // Even Odd check
    public void findOddEven(int num) {
        if (num % 2 == 0){
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }


    public static void main(String[] args) {
        DigitManipulationDemo dm = new DigitManipulationDemo();
//        dm.findDigitsUsingFormula(0);
//        dm.findDigitsUsingDivision(0);
//        dm.appendDigit(0, 1);
//        dm.insertAtFront(0, 3);
//        dm.reverseNumber(100);
        dm.findOddEven(91);
    }
}
