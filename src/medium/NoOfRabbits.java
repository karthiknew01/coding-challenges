package medium;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/rabbits-in-forest/?envType=daily-question&envId=2025-04-20">...</a>
 */
public class NoOfRabbits {

    public static void main(String[] args) {
        int[] answers = { 10, 10, 10 };
        System.out.println(numRabbits(answers));
    }

    public static int numRabbits(int[] answers) {
        int count = 0, n = answers.length, answer = 0;
        Arrays.sort(answers);
        for (int i = 0; i < n; i++) {
            int ans = answers[i];

            if (ans == 0) {
                answer++;
            } else if (i == 0 || answers[i] != answers[i - 1] || count == 0) {
                answer += ans + 1;
                count = answers[i];
            } else {
                count--;
            }

        }


        return answer;
    }

}
