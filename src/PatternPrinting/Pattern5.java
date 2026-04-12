package PatternPrinting;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            // for each row -> variable columns
            // space
            for (int col = 1; col <= n - row; col++) {
                System.out.print("\t");
            }
            // stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*\t");
            }
            // move t0 next row
            System.out.println();
        }
    }
}
