package Strings.Demo;
import java.util.*;
public class StringIntChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abc";
//        str = str + "def";
        str += "xyz";
        str += 'r';
        str += 3;
        System.out.println(str);
        System.out.println("abc");
        System.out.println("abc" + "def");
        System.out.println("abc" + 'r');
        System.out.println("abc" + 10);
        System.out.println("abc" + 10 + 20 );
        System.out.println( 10 + 20 +"abc");
        System.out.println("abc" + (10 + 20));
    }
}
