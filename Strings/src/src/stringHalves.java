import java.util.Set;

public class stringHalves {
    public static void main(String[] args) {

        System.out.println(halvesAreAlike("textbook"));

    }

    public static boolean halvesAreAlike(String s) {
        int length = s.length();
        int midPoint = length / 2;

        String firstHalf = s.substring(0, midPoint);
        String secondHalf = s.substring(midPoint);

        return countVowels(firstHalf) == countVowels(secondHalf);

    }

    private static int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char ch) {
        // Convert the character to lowercase to make the comparison case-insensitive
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
