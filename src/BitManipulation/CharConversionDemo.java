package BitManipulation;

public class CharConversionDemo {
    private char toLower(char ch) {
        return (char) (ch | (1<<5));
    }

    private char toUpper(char ch) {
        return (char) (ch & ~(1<<5));
    }

    public static void main(String[] args) {
        CharConversionDemo cc = new CharConversionDemo();
        System.out.println("lower: " + cc.toLower('A'));
        System.out.println("Upper: " + cc.toUpper('b'));
    }
}
