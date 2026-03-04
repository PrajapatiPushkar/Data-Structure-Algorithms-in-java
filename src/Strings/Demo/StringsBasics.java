package Strings.Demo;

import java.util.Scanner;

public class StringsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = "Pushkar Prajapati";
//        System.out.println(str);
//        String st = sc.nextLine();
//        System.out.println(st);

//        String str = "Hello";
//        int len = str.length(); // length(
//        System.out.println(len);
//        System.out.println(str.length());
//        char ch = str.charAt(4); //charAt();
//        System.out.println(ch);
//        System.out.println(str.charAt(2));
//        String gtr = "Zello";

//        System.out.println(str.indexOf('H')); // indexOf()
//        System.out.println(str.compareTo(gtr));

        String str = "hello world";
        String gtr = " Pushkar";
        System.out.println(str.contains("ll"));
        System.out.println(str.startsWith("hel"));
        System.out.println(str.endsWith("lo"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.concat(gtr));
    }
}
