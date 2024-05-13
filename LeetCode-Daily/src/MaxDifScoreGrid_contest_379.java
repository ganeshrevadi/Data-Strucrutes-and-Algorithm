import  java.util.*;

public class MaxDifScoreGrid_contest_379 {
    public static void main(String[] args) {

    }

    public static  int maxScore(List<List<Integer>> grid) {
        int n = grid.get(0).size();
        int m = grid.size();

        int[][] dp = new int[m][n];

        dp[m - 1][n - 1] = grid.get(m - 1).get(n - 1);

        for(int i = m - 1; i >= 0; --i){
            for(int j = n - 1; j >= 0; --j){
                if(i < m - 1)dp[i][j] = Math.max(dp[i][j], dp[i + 1][j]);
                if(j < n - 1) dp[i][j] = Math.max(dp[i][j], dp[i][j + 1]);

                dp[i][j]  = Math.max(dp[i][j], grid.get(i).get(j));
            }
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(j < m - 1) max = Math.max(max, dp[i + 1][j] - grid.get(i).get(j));
                if(j < n - 1) max = Math.max(max, dp[i][j + 1] - grid.get(i).get(j));
            }

        }

        List<Integer> arr = new ArrayList<>();


        return max;
    }
}
