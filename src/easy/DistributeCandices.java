package easy;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/distribute-candies-among-children-ii/description/?envType=daily-question&envId=2025-06-01">...</a>
 */
public class DistributeCandices {

    public static void main(String[] args) {
        int[] candyType = {6,6,6,6};

        System.out.println(distributeCandies(candyType));
    }

    public static int distributeCandies(int[] candyType) {
        int eatable = candyType.length / 2;

        Map<Integer, Boolean> map = new HashMap<>();

        for (int candy: candyType)
            map.put(candy, true);

        return Math.min(eatable, map.size());
    }



}
