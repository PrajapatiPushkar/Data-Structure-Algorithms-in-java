package Strings.practice;

public class CountLength {

    public static int getLengthOfString(String str) {
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }

    public static void main(String[] args) {
        String str = "LOVE";
        System.out.println(getLengthOfString(str));
    }
}
