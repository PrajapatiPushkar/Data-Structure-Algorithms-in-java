package BitManipulation;

public class RightMostSetBit {
    private int rightMostSetBit(int num) {
        return (num & - num);
    }

    public static void main(String[] args) {
        int num = 12;
        RightMostSetBit cb = new RightMostSetBit();
        int result = cb.rightMostSetBit(num);
        System.out.println("Result with only right most set bit of " + num + " is: " + result);
    }
}
