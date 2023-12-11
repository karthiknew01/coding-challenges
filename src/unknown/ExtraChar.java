package unknown;

import java.util.Arrays;

public class ExtraChar {

    public static void main(String[] args) {

        String s = "ecolloycollotkvzqpdaumuqgs";
        String[] dictionary = new String[] {"flbri","uaaz","numy","laper","ioqyt","tkvz","ndjb","gmg","gdpbo","x","collo","vuh","qhozp","iwk","paqgn","m","mhx","jgren","qqshd","qr","qpdau","oeeuq","c","qkot","uxqvx","lhgid","vchsk","drqx","keaua","yaru","mla","shz","lby","vdxlv","xyai","lxtgl","inz","brhi","iukt","f","lbjou","vb","sz","ilkra","izwk","muqgs","gom","je"};
        int extraChar = minExtraChar(s, dictionary);
        System.out.println(extraChar);
    }

    private static int minExtraChar(String s, String[] dictionary) {
        for (int i = 0; i < dictionary.length; i++) {
            if (s.contains(dictionary[i])) {
                s = s.replace(dictionary[i], "");
                i = 0;
            }
        }
        return s.length();
    }
}
