package medium;

/**
 * <a href="https://leetcode.com/problems/container-with-most-water/description/">...</a>
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = new int[] {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        if (height.length == 2) {
            return Math.min(height[0], height[1]);
        }

        int maxHeight = 0;
        int left = 0, right = height.length - 1;
        while(left < right) {
            int leftVal = height[left];
            int rightVal = height[right];
            maxHeight = Math.max(maxHeight, Math.min(leftVal, rightVal) * (right - left));
            if (leftVal < rightVal)
                left++;
            else right--;
        }

        return maxHeight;
    }
}
