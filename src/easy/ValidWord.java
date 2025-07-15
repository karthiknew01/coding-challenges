package easy;

import java.util.Arrays;
import java.util.List;

/** <a href="https://leetcode.com/problems/valid-word/?envType=daily-question&envId=2025-07-15">...</a> */
public class ValidWord {

    public static void main(String[] args) {
        boolean valid = isValid("a3$e");
        System.out.println(valid);
    }



    public static boolean isValid(String word) {

        if (word.length() < 3)
            return false;

        boolean hasVowel = false;
        boolean hasConstant = false;

        List<Character> symbols = Arrays.asList('@', '#', '$');
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        for (char w: word.toCharArray()) {
            if (symbols.contains(w)) return false;

            if ((!hasConstant || !hasVowel) && Character.isLetter(w)) {
                boolean isVowel = vowels.contains(w);
                if (isVowel) hasVowel = true;
                if (!isVowel) hasConstant = true;
            }
        }


        return hasVowel && hasConstant;
    }

}
