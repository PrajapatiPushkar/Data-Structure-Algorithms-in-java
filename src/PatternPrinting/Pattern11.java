package PatternPrinting;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            // for each row -> variable columns
            for (int col = 1; col <= row; col++) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }
}
