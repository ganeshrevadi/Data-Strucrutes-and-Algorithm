public class validPalindromeII {
    public static void main(String[] args) {

        String s = "abca";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start <= end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            else{
                return isPal(s.substring(start + 1, end + 1)) || isPal(s.substring(start,end));
            }

        }
        return true;
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
