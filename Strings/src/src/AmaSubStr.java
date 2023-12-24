public class AmaSubStr {
    public static void main(String[] args) {
        System.out.println(solve("ABEC"));
    }

    public static int solve(String A) {
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if(isVowel(A.charAt(i))){
                count += A.substring(i , A.length()).length();
            }
        }


        return count % 10003;
    }

    public static boolean isVowel(char ch) {
        // Convert the character to lowercase to make the comparison case-insensitive
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
