package hard;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/maximum-candies-you-can-get-from-boxes/description/?envType=daily-question&envId=2025-06-03">...</a>
 */
public class MaxCandiesFromBoxes {

    public static void main(String[] args) {
        int[] status = {1,0,0,0,0,0}, candies = {1,1,1,1,1,1}, initialBoxes = {0};
        int[][] keys = {{1,2,3,4,5}, {}, {},{}, {}, {}}, containedBoxes = {{1,2,3,4,5}, {}, {},{}, {}, {}};
        System.out.println(maxCandies(status, candies, keys, containedBoxes, initialBoxes));
    }

    public static int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int totalCandies = 0;
        boolean openableBox = true;
        List<Integer> boxes = new ArrayList<>();
        for(int b: initialBoxes) boxes.add(b);
        while (!boxes.isEmpty() && openableBox) {
            openableBox = false;
            List<Integer> nextBoxes = new ArrayList<>();
            for (int boxId: boxes) {
                if (status[boxId] == 1) {
                    openableBox = true;
                    for (int k: containedBoxes[boxId]) nextBoxes.add(k);
                    for (int keyId: keys[boxId]) status[keyId] = 1;
                    totalCandies += candies[boxId];
                } else {
                    nextBoxes.add(boxId);
                }
            }
            boxes = nextBoxes;
        }
        return totalCandies;
    }

}
