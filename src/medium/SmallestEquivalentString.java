package medium;

/**
 * <a href="https://leetcode.com/problems/lexicographically-smallest-equivalent-string/description/?envType=daily-question&envId=2025-06-05">...</a>
 */
public class SmallestEquivalentString {

    public static void main(String[] args) {
        String s1 = "parker", s2 = "morris", baseStr = "parser";
        System.out.println(smallestEquivalentString(s1,s2,baseStr));
    }

    static int[] union = new int[26];

    public static String smallestEquivalentString(String s1, String s2, String baseStr) {

        for (int i = 0; i < 26; i++)
            union[i] = i;

        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            int par1 = findParent(a);
            int par2 = findParent(b);

            if (par1 < par2) {
                union[par2] = par1;
            } else {
                union[par1] = par2;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char c: baseStr.toCharArray()) {
            int parent = findParent(c);
            char ch = (char) (parent + 'a');
            sb.append(ch);
        }


        return sb.toString();
    }

    private static int findParent(char ch) {
        int parent = union[ch - 'a'];

        while (union[parent] != parent)
            parent = union[parent];

        return parent;
    }

}
