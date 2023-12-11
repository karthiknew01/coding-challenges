package unknown;

public class ReverseNumber {

    public static void main(String[] args) {
        int x = 153423646;
        int y = reverse(x);
        System.out.println(y);
    }

    public static int reverse(int x) {
        try {
            long y = 0;

            while (x % 10 != x) {
                y = Math.addExact(y * 10, x % 10);
                x = x / 10;
            }

            y = Math.addExact(y * 10, x);

            if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) {
                return 0;
            }

            return (int) y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

}
