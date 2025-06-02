package hard;

/**
 * <a href="https://leetcode.com/problems/candy/description/?envType=daily-question&envId=2025-06-02">...</a>
 */
public class DistributeCandy {

    public static void main(String[] args) {
        int[] rating = {1,2,87,87,87,2,1};
        System.out.println(candy(rating));
    }

    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];

        candies[0] = 1;
        for (int i = 1; i < n; i++)
            if (ratings[i - 1] < ratings[i])
                candies[i] = candies[i - 1] + 1;
            else
                candies[i] = 1;

        int count = 0;
        for (int i = n - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i]) {
                candies[i - 1] = Math.max(candies[i] + 1, candies[i - 1]);
            }

            count += candies[i - 1];
        }
        return count + candies[n - 1];
    }

}
