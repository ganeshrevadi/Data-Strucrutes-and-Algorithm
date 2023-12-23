public class RCC {
    public static void main(String[] args) {
        System.out.println(solve("aabbccd", 2));
    }
    public static String solve(String A, int B) {
        StringBuilder s = new StringBuilder(A);
        int consecutiveCount = 1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check if the next character is the same
            if (i + 1 < s.length() && ch == s.charAt(i + 1)) {
                consecutiveCount++;
            } else {
                // If consecutiveCount equals B, delete the consecutive substring
                if (consecutiveCount == B) {
                    s.delete(i - B + 1, i + 1);
                    i = i - B; // Decrement i to avoid skipping characters after deletion
                }
                consecutiveCount = 1; // Reset consecutiveCount for the next character
            }
        }

        return s.toString();
    }
}
