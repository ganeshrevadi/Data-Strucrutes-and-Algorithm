import java.util.*;
public class MaxConsectiveGap {
    public static void main(String[] args) {

    }

    public static int maximumGap(final int[] A) {
        Arrays.sort(A);
        if(A.length < 2){
            return 0;
        }
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 0; i < A.length - 1; i++) {
            int diff = A[i + 1] - A[i];
            if(diff > maxDiff){
                maxDiff = diff;
            }
        }


        return maxDiff;

    }
}
