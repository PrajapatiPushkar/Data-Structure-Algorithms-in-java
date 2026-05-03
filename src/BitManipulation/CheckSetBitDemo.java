package BitManipulation;

public class CheckSetBitDemo {

    private boolean checkSetBit(int num, int k) {
       return  ((1 << k) & num) != 0;
    }

    public static void main(String[] args) {
        int k = 2;
        int num = 13;
        CheckSetBitDemo ch = new CheckSetBitDemo();
        if (ch.checkSetBit(num, k)) {
            System.out.println("K th bit of " + num + " was set, k = " + k);
        } else {
            System.out.println("K th bit of " + num + " was not set, k = " + k);
        }
    }
}
