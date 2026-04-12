package PatternPrinting;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {
            // for each row -> n columns
            for (int col = 1; col <= n; col++) {
                // print star
                System.out.print("*\t");
            }
            // move to next line or row
            System.out.println();
        }
    }
}
