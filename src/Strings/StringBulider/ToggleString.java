package Strings.StringBulider;

public class ToggleString {
    public static void main(String[] args) {
        String str = "PhYsIcS";
        System.out.println(str);
//        StringBuilder sb = new StringBuilder(str);
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
                str = str.substring(0, i) + dh + str.substring(i+1);
            } else {
                asci -= 32;
                char dh = (char)asci;
                str = str.substring(0, i) + dh + str.substring(i+1);
            }
        }
        System.out.println(str);

    }
}
