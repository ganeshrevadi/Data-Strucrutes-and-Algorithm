import java.util.Scanner;

public class TwoMovies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] results = new int[t];

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }

            for (int j = 0; j < n; j++) {
                b[j] = scanner.nextInt();
            }

            int posA = 0, negA = 0, posB = 0, negB = 0;

            for (int j = 0; j < n; j++) {
                if (a[j] == 1) posA++;
                else if (a[j] == -1) negA++;
                if (b[j] == 1) posB++;
                else if (b[j] == -1) negB++;
            }

            int totalPos = posA + posB;
            int totalNeg = negA + negB;

            // Initial ratings
            int ratingA = 0, ratingB = 0;
            for (int j = 0; j < n; j++) {
                ratingA += a[j];
                ratingB += b[j];
            }

            int possibleMinRating = Math.min(ratingA + posB - negB, ratingB + posA - negA);
            results[i] = possibleMinRating;
        }

        for (int result : results) {
            System.out.println(result);
        }

        scanner.close();
    }
}
