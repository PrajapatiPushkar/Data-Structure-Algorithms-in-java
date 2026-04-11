package MathsForDSA1;

public class GcdDemo {

    private int findGcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int min = Math.min(a,b);
        int res = 1;
        for (int i = 2; i <= min; i++){
            if (a % i == 0 && b % i == 0) {
                res = i;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        GcdDemo gd = new GcdDemo();
        int a = 11;
        int b = 18;
        System.out.println("GCD of " + a + " and " + b + " is: " + gd.findGcd(a,b));
    }
}
