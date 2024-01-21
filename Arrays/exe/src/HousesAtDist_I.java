import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class HousesAtDist_I {
    public static void main(String[] args) {
        int[] res = countOfPairs(4 , 1 , 3);
        System.out.println(Arrays.toString(res));
    }

    public static int[] countOfPairs(int n, int x, int y) {
        int[] result = new int[n];
            int r = 2;
        // Calculate distances from house i to house j
        for (int i = 0; i < n; i++) {
            result[i] = nCr(n , r);
            r++;
        }

        return result;
    }

    static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    static int fact(int n) {
        if (n == 0)
            return 1;
        int res = 1;
        for (int i = 2; i <= n; i++)
            res *= i;
        return res;
    }
}
