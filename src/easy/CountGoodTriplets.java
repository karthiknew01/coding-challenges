package easy;

/**
 * <a href="https://leetcode.com/problems/count-good-triplets/description/?envType=daily-question&envId=2025-04-13">...</a>
 */
public class CountGoodTriplets {

    public static void main(String[] args) {
        int[] arr = {7,3,7,3,12,1,12,2,3};
        int a = 5, b = 8, c = 1;
        System.out.println(countGoodTriplets(arr, a, b, c));
    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int triplets = 0;
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i+1; j < n - 1; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < n; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c)
                            triplets++;
                    }
                }
            }
        }

        return triplets;
    }

}

