import java.util.ArrayList;

public class FiboMemo {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }

        System.out.println(fibo(n , dp));
        System.out.println(fibo2(n));

    }

    //Memoization && Top Down approach
    public static int fibo(int n , int[] dp){
        if(n <= 1){
            return n;
        }
        if(dp[n] != -1) return dp[n];

        return dp[n] = fibo(n - 1,dp) + fibo(n - 2,dp);
    }


    //Tabulation && Bottom Up approach
    public static int fibo2(int n){
        int prev2 = 0;
        int prev = 1;
        for (int i = 2; i <= n ; i++) {
            int curi = prev2 + prev;
            prev2 = prev;
            prev = curi;
        }

        return prev;
    }

}
