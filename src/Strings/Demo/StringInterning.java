package Strings.Demo;

public class StringInterning {
    public static void main(String[] args) {
        String s = "Hello";
        String x = "Hello";
        x = "Mello";
        System.out.println(x);
        System.out.println(s);
        s = "Dello";
        System.out.println(s);
    }
}
