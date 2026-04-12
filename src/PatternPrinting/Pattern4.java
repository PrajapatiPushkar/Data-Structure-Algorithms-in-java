package PatternPrinting;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            // for each row -> variable columns
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*\t");
            }
            // move to the next row
            System.out.println();
        }
    }
}
