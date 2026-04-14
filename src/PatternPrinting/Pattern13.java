package PatternPrinting;

public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            // for each row -> variable col
            for (int col = 1; col <= row; col++) {
                int a = col;
                int b = ('A' - 1);
                int ans = a + b;
                char finalAns = (char) ans;
                System.out.print(finalAns + "\t");
            }
            System.out.println();
        }
    }
}
