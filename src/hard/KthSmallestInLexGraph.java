package hard;

public class KthSmallestInLexGraph {

    public static void main(String[] args) {
        System.out.println(findKthNumber(804289384, 42641503));
    }

    static int res = 0;
    public static Integer findKthNumber(int n, int k) {
        dfs(1, n, 0, k);
        return res;
    }

    public static void dfs(int startIndex, int n, int i, int k) {
        System.out.println(i + " " + k);
        if (i >= k)
            return;

        if (startIndex > n)
            return;

        res = startIndex;
        dfs(startIndex * 10, n, i + 1, k);
        if (startIndex % 10 != 9)
            dfs(startIndex + 1, n, i + 1, k);
    }

}
