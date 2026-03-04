package Strings.Demo;

public class StringsPerformance {
    public static void main(String[] args) {
        String str = "";
        for (int i = 1; i <= 10; i++){
            str = str + i;
        }
        System.out.println(str);
    }
}
