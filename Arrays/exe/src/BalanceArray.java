public class BalanceArray {
    public static void main(String[] args) {
        int[] a = {5, 5, 2, 5, 8};
        System.out.println(solve(a));
    }

    static boolean isBalancedAfterRemoval(int[] prefixSumEven, int[] prefixSumOdd, int index) {
        // Check if removing the element at 'index' makes the array balanced
        // by comparing the sum of even and odd indices after removal.
        // Return true if balanced, false otherwise.
        int sumEvenBefore = prefixSumEven[index];
        int sumOddBefore = prefixSumOdd[index];
        int sumEvenAfter = prefixSumEven[prefixSumEven.length - 1] - prefixSumEven[index + 1];
        int sumOddAfter = prefixSumOdd[prefixSumOdd.length - 1] - prefixSumOdd[index + 1];

        return sumEvenBefore + sumOddAfter == sumOddBefore + sumEvenAfter;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int[] prefixSumEven = new int[n + 1];
        int[] prefixSumOdd = new int[n + 1];
        int countSpecial = 0;

        // Calculate prefix sums for even and odd indices separately
        for (int i = 0; i < n; i++) {
            prefixSumEven[i + 1] = prefixSumEven[i] + ((i % 2 == 0) ? A[i] : 0);
            prefixSumOdd[i + 1] = prefixSumOdd[i] + ((i % 2 != 0) ? A[i] : 0);
        }

        // Iterate through each element and check if it makes the array balanced
        for (int i = 0; i < n; i++) {
            if (isBalancedAfterRemoval(prefixSumEven, prefixSumOdd, i)) {
                countSpecial++;
            }
        }

        return countSpecial;
    }
}
