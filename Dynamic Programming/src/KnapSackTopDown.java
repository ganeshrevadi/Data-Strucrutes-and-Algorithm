import java.util.Arrays;

public class KnapSackTopDown {

    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };
        int W = 50;
        int n = val.length;

        System.out.println(knapsack(wt,val,W,n));
    }

    public static int knapsack(int[] wt,int[] val,int W,int n){
        int[][] memo = new int[n + 1][W + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if(i == 0 || j == 0){
                    memo[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1 ; j++) {
                if(wt[i - 1] <= j){
                    memo[i][j] = Math.max(val[i - 1] + memo[i - 1][j - wt[i - 1]],memo[i - 1][j]);
                } else{
                    memo[i][j] = memo[i - 1][j];
                }
            }
        }
        return memo[n][W];

    }
}
