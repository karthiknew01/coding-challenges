package easy;

public class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("101", "11"));
    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder binary = new StringBuilder();
        int carry = 0;
        while(i >= 0 || j >= 0) {
            int aInt = i >= 0 ? a.charAt(i--) - 48 : 0;
            int bInt = j >= 0 ? b.charAt(j--) - 48 : 0;
            carry = aInt + bInt + carry;
            binary.append(carry % 2); carry /= 2;
        }
        if (carry == 1) binary.append(carry);

        return binary.reverse().toString();
    }

}