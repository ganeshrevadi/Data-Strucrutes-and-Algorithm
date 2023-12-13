import java.math.BigInteger;

public class NthFibo {

    public static void main(String[] args) {
        System.out.println(solve(50));
    }

    public static BigInteger solve(int A) {
        return solve(A);
    }

    public static BigInteger fibo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative.");
        }

        if (n == 0 || n == 1) {
            return BigInteger.valueOf(n);
        }
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger result = BigInteger.ZERO;

        for (int i = 2; i <= n; i++) {
            result = a.add(b);
            a = b;
            b = result;
        }

        return result;
    }
}
