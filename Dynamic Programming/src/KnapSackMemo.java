import java.util.Arrays;

public class KnapSackMemo {
    public static int[][] memo = new int[102][1002];
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };
        int W = 50;
        int n = val.length;

        for(int[] arr : memo){
            Arrays.fill(arr,-1);
        }

        System.out.println(knapsack(wt,val,W,n));
    }

    public static int knapsack(int[] wt,int[] val,int W,int n){

        if(memo[n][W] != -1){
            return memo[n][W];
        }
        else{
            if( n == 0 || W == 0){
                return 0;
            }

            if(wt[n - 1] <= W){
                return memo[n][W] = Math.max(val[n - 1] + knapsack(wt , val , W - wt[n - 1],n - 1),knapsack(wt,val,W,n - 1));
            } else{
                return memo[n][W] = knapsack(wt,val,W,n - 1);
            }
        }
    }


}
