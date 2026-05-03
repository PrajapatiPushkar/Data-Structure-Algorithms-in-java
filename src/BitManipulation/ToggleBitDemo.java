package BitManipulation;

public class ToggleBitDemo {
    private int toggle(int num, int k) {
        return ((1<<k) ^ num);
    }

    public static void main(String[] args) {
        int k = 1;
        int num = 13;
        ToggleBitDemo cb = new ToggleBitDemo();
        int result = cb.toggle(num, k);
        System.out.println("after toggling kth bit, result " + result);
    }
}
