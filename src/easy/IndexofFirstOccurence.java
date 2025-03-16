package easy;

public class IndexofFirstOccurence {

    public static void main(String[] args) {
        String haystack = "leetcode", needle = "leeto";
        int result = strStr(haystack, needle);
        System.out.print(result);
    }

    public static int strStr(String haystack, String needle) {
        int index = -1;

        int hayLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i <= hayLength - needleLength; i++) {
            String subString = haystack.substring(i, i + needleLength);
            if (subString.equals(needle)) {
                return i;
            }
        }

        return index;
    }
}
