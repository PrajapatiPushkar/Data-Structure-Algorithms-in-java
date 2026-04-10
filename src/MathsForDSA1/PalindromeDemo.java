package MathsForDSA1;

public class PalindromeDemo {

    public boolean isPalindrome(int num) {
        if (num < 0) return false;

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        PalindromeDemo pd = new PalindromeDemo();

        int num = 121;
        System.out.println("Is " + num + " Palindrome? ->" + pd.isPalindrome(num));
    }
}
