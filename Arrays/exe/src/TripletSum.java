import java.util.Arrays;

public class TripletSum {
    public static void main(String[] args) {
        String[] s = {"2.673662", "2.419159", "0.573816", "2.454376", "0.403605", "2.503658", "0.806191"};
        System.out.println(solve(s));
    }


    public static int solve(String[] A) {
        int n = A.length;
        double[] arr = new double[n];

        // Convert strings to doubles and sort the array
        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(A[i]);
        }

        Arrays.sort(arr);
        int start  = 0 ;
        int end = arr.length - 1;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                double sum = arr[i] + arr[left] + arr[right];

                if (sum > 1 && sum < 2) {
                    // Triplet found
                    return 1;
                } else if (sum <= 1) {
                    // Move mid pointer to the right
                    left++;
                } else {
                    // Move right pointer to the left
                    right--;
                }
            }
        }
        return 0;
    }
}
