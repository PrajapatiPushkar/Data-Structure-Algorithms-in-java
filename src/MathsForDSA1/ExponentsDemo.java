package MathsForDSA1;

public class ExponentsDemo {

    public void findPower(int a, int b){
        boolean isNegative = false;
        if (b < 0){
            b = -1 * b;
            isNegative = true;
        }
        double result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        if (isNegative){
            result = 1 / result;
        }
        System.out.println("Power is: " + result);
    }

    public void fastExponentiation(int a, int b){
        boolean isNegative = false;
        if (b < 0) {
            isNegative = true;
            b = -1 * b;
        }
        double result = 1.0;
        while (b > 0) {
            if (b % 2 != 0) {
                result = result * a;
                b--;
            }
            b = b / 2;
            a = a * a;
        }
        if (isNegative) {
            result = 1 / result;
        }
        System.out.println("Result is: " + result);
    }

    public static void main(String[] args) {
        ExponentsDemo ed = new ExponentsDemo();
//        ed.findPower(2, 4);
        ed.fastExponentiation(2,-5);
    }
}
