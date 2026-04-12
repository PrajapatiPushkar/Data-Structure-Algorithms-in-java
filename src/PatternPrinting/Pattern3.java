package PatternPrinting;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            // for each row -> space, star

            // space
            for (int col = 1; col <= n - row; col++) {
                System.out.print("\t");
            }
            // stars
            for (int col = 1; col <= n; col++) {
                System.out.print("*\t");
            }
            // move to next row
            System.out.println();
        }
    }
}
