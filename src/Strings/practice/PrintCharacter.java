package Strings.practice;

public class PrintCharacter {

    public static void printSting(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }


    public static void main(String[] args) {
        String str = "Love is life";
        printSting(str);
    }
}
