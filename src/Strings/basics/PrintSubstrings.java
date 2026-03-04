package Strings.basics;

//Given a string s, print all the substrings of s.

public class PrintSubstrings {
    public static void main(String[] args) {
        String str = "abcd"; // o to 3
        for (int i = 0; i <= 3; i++){
            for (int j = i + 1; j <= 4; j++){
                System.out.print(str.substring(i,j) + " ");
            }
        }
    }
}
