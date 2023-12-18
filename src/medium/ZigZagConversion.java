package medium;

public class ZigZagConversion {

    public static void main(String[] args) {
        int numRows = 4;
        String s = "PAYPALISHIRING";
        System.out.println(convert(s, numRows));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() < 2) {
            return s;
        }
        StringBuffer r = new StringBuffer();
        for (int j = 0; j < numRows; j++) {
            int newIndex = (numRows - 1) * 2;
            for (int i = j; i < s.length(); i=i+newIndex) {
                r.append(s.charAt(i));
                int middleRows = i + newIndex - 2*j;
                if (j > 0 && j < numRows - 1 && middleRows < s.length()) {
                    r.append(s.charAt(middleRows));
                }
            }
        }

        return r.toString();
    }
}
