import java.util.Collections;

public class longestPrefix {
    public static void main(String[] args) {
        String[] str = {"aaa","aa","aaa"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        if (strs == null || strs.length == 0)
            return "";

        String ref = strs[0];

        for (int i = 0; i < ref.length(); i++) {
            char c = ref.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return sb.toString();
                }
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
