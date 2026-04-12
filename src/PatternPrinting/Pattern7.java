package PatternPrinting;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 8;

        for (int row = 1;  row <= n; row++) {
            // for each row -> 6 columns
            for (int col = 1; col <= 6; col++) {
                if (row == 1 || row == n) {
                    System.out.print("*\t");
                }
                else {
                    // middle rows
                    if (col == 1) {
                        System.out.print("*\t");
                    } else if (col == 6) {
                        System.out.print("*\t");
                    } else {
                        // middle columns
                        System.out.print("\t");
                    }
                }
            }
            // move to next row
            System.out.println();
        }
    }
}
