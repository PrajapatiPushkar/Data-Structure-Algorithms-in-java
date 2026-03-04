package Strings.StringBulider;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        // toggle
        // PhysiCs -> phYSIcS

        for (int i = 0; i < str.length(); i++){
            // p -> P
            // check -> alphabet - small, capital
            boolean flag = true; // true -> capital
            char ch = str.charAt(i);
            int asci = (int)ch;
            if (asci >= 97) flag = false; // small
            if (flag == true) {
                asci += 32;
                char dh = (char)asci;  // a
                str.setCharAt(i,dh);
            } else {
                asci -= 32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }

        }
        System.out.println(str);
    }
}
