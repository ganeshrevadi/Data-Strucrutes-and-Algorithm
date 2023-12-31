public class LongestPalSubStr {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {
//        int n = s.length();
//        boolean[][] isPalindrome = new boolean[n][n];
//
//        int maxLen = 0;
//        int start = 0;
//
//        // All substrings of length 1 are palindromes
//        for (int i = 0; i < n; i++) {
//            isPalindrome[i][i] = true;
//            maxLen = 1;
//        }
//
//        // Check substrings of length 2
//        for (int i = 0; i < n - 1; i++) {
//            if (s.charAt(i) == s.charAt(i + 1)) {
//                isPalindrome[i][i + 1] = true;
//                start = i;
//                maxLen = 2;
//            }
//        }
//
//        // Check substrings of length 3 or more
//        for (int len = 3; len <= n; len++) {
//            for (int i = 0; i <= n - len; i++) {
//                int j = i + len - 1;
//                if (isPalindrome[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
//                    isPalindrome[i][j] = true;
//                    start = i;
//                    maxLen = len;
//                }
//            }
//        }
//
//        return s.substring(start, start + maxLen);


        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() -1; j >= 0; j--) {
                if (isPal(s.substring(i, j + 1))) {
                    return s.substring(i, j + 1);
                }
            }
        }
        return s;

    }

    private static boolean isPal(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start <= end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
