package easy;

import java.util.*;

public class KMaxSequence {

    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 3};
        int k = 2;
        int[] res = maxSubsequence(nums, k);
        for (int r: res)
            System.out.println(r);
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            pq.offer(new int[] { nums[i], i});
            if (pq.size() > k) {
                pq.poll();
            }
        }

        Set<Integer> index = new HashSet<>();

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            index.add(top[1]);
        }

        int p = 0;
        int[] res = new int[k];

        for (int i = 0; i < n; i++) {
            if (index.contains(i)) {
                res[p++] = nums[i];
            }
        }

        return res;

    }

}
