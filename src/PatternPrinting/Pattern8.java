package PatternPrinting;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            // for each row -> variable columns
            if (row == 1 || row == 2 || row == n) {
                for (int col = 1;  col <= row; col++) {
                    System.out.print("*\t");
                }
            } else {
                // middle rows
                // print 1*
                System.out.print("*\t");
                // (row -2 ) spaces
                for (int col = 1; col <= (row - 2); col++) {
                    System.out.print("\t");
                }
                // print 1*
                System.out.print("*\t");
            }
            // move to next row
            System.out.println();
        }
    }
}
