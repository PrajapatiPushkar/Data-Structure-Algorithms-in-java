package Strings.practice;

public class ReverseString {

    public static String reverse(String str) {
        String reverse = "";
        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

    public static void main(String[] args) {
        String str = "LOVE";
        System.out.println(reverse(str));
    }
}
