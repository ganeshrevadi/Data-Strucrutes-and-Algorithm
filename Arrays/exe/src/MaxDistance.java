public class MaxDistance {
    public static void main(String[] args) {
        int[] a = {3, 5, 4, 2};
        System.out.println(maximumGap(a));
    }

    public static int maximumGap(final int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int n = A.length;
        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        // Precompute the minimum value to the left of each element
        leftMin[0] = A[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], A[i]);
        }

        // Precompute the maximum value to the right of each element
        rightMax[n - 1] = A[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], A[i]);
        }

        // Use two pointers to find the maximum gap
        int i = 0, j = 0, maxGap = -1;
        while (i < n && j < n) {
            if (leftMin[i] <= rightMax[j]) {
                maxGap = Math.max(maxGap, j - i);
                j++; // Expand the right side of the range
            } else {
                i++; // Expand the left side of the range
            }
        }

        return maxGap;
    }
}
