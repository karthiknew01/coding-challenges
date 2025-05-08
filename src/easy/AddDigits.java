package easy;

public class AddDigits {

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;

            if (num == 0 && sum >= 10) {
                num = sum;
                sum = 0;
            }

        }

        return sum;
    }

}
