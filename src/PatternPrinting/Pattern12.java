package PatternPrinting;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;

        for (int row = 1; row <= n; row++) {
            // for each row -> variable col
            for (int col = 1; col <= row; col++) {
                System.out.print(count + "\t");
                count++;
            }
            System.out.println();

        }
    }
}
