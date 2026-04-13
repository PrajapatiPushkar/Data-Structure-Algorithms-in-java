package PatternPrinting;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {
            // Part 1
            for (int col = 1; col <= row; col++) {
                System.out.print("*\t");
            }
            // Part 2
            for (int col = 1; col <= 2 * (n - row); col++) {
                System.out.print("\t");
            }
            // part 3
            for (int col = 1; col <= row; col++) {
                System.out.print("*\t");
            }

            System.out.println();
        }

        // Inverted symmetrical
        for (int row = 1; row <= n; row++) {
            // part 4
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*\t");
            }
            //part 5
            for (int col = 1; col <= 2 * (row - 1); col++) {
                System.out.print("\t");
            }
            //part 6
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*\t");
            }


            System.out.println();
        }

    }
}
