public class VowelConsonantSubString {
    public static void main(String[] args) {
        System.out.println(solve("a"));
    }

    public static int solve(String str) {
        int n = str.length();
//        boolean[] isVowelArray = new boolean[n];
//
//        // Precompute whether each character is a vowel
//        for (int i = 0; i < n; i++) {
//            isVowelArray[i] = isVowel(str.charAt(i));
//        }
//
//        int count = 0;
//
//        // Count pairs of vowels and non-vowels
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if ((isVowelArray[i] && !isVowelArray[j]) || (!isVowelArray[i] && isVowelArray[j])) {
//                    count++;
//                }
//            }
//        }
        int vowelCount = 0;
        int NonVowelCount = 0;
        for (int i = 0; i < n; i++) {
            if (isVowel(str.charAt(i))){
                vowelCount++;
            }
            else {
                NonVowelCount++;
            }
        }

        int count = vowelCount * NonVowelCount;

        return count % 1000000007;
    }

    public static boolean isVowel(char ch) {
        // Convert the character to lowercase to make the comparison case-insensitive
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}
