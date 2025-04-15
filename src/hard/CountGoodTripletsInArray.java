package hard;

/**
 * <a href="https://leetcode.com/problems/count-good-triplets-in-an-array/description/?envType=daily-question&envId=2025-04-15">...</a>
 */
public class CountGoodTripletsInArray {

    public static void main(String[] args) {
        int[] nums1 = {13,14,10,2,12,3,9,11,15,8,4,7,0,6,5,1},  nums2 = {8,7,9,5,6,14,15,10,2,11,4,13,3,12,1,0};
        System.out.println(goodTriplets(nums1, nums2));
    }

    public static long goodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] pos2 = new int[n];

        for (int i = 0; i < n; i++) {
            pos2[nums2[i]] = i;
        }

        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = pos2[nums1[i]] + 1;
        }

        FenwickTree leftTree = new FenwickTree(n);
        long[] left = new long[n];
        for (int i = 0; i < n; i++) {
            left[i] = leftTree.query(A[i] - 1);
            leftTree.update(A[i], 1);
        }

        FenwickTree rightTree = new FenwickTree(n);
        long[] right = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            right[i] = rightTree.query(n) - rightTree.query(A[i]);
            rightTree.update(A[i], 1);
        }

        long result = 0;
        for (int i = 0; i < n; i++) {
            result += left[i] * right[i];
        }

        return result;
    }

    static class FenwickTree {
        int size;
        int[] tree;

        public FenwickTree(int size) {
            this.size = size;
            tree = new int[size + 1];
        }

        public void update(int index, int delta) {
            while (index <= size) {
                tree[index] += delta;
                index += index & -index;
            }
        }

        public int query(int index) {
            int sum = 0;
            while (index > 0) {
                sum += tree[index];
                index -= index & -index;
            }

            return sum;
        }

    }

}

