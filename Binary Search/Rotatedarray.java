public class Rotatedarray {
    public static void main(String[] args) {

    }
    public int solve(int[] A, int B) {
        int peakIndex = findPeak(A);

        int increasingResult = binarySearchIncreasing(A, B, 0, peakIndex);
        if (increasingResult != -1) {
            return increasingResult;
        }

        return binarySearchDecreasing(A, B, peakIndex + 1, A.length - 1);
    }
    private static int findPeak(int[] A) {
        int start = 0;
        int end = A.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (A[mid] > A[mid + 1]) {
                // Decreasing side of the bitonic sequence
                end = mid;
            } else {
                // Increasing side of the bitonic sequence
                start = mid + 1;
            }
        }

        return start;
    }

    private static int binarySearchIncreasing(int[] A, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (A[mid] == target) {
                return mid;
            } else if (A[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    private static int binarySearchDecreasing(int[] A, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (A[mid] == target) {
                return mid;
            } else if (A[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
