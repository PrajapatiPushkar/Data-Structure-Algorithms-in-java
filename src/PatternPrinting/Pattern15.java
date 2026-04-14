package PatternPrinting;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {
            // part 1
            for (int col = 1; col <= n - row; col++) {
                System.out.print("\t");
            }
            // part 2
            for (int col = 1; col <= row; col++) {
                System.out.print(col + "\t");
            }
            //part 3
            int rowValue = row;
            int decRowValue = row - 1;
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(decRowValue + "\t");
                decRowValue--;
            }

            System.out.println();
        }
    }
}
