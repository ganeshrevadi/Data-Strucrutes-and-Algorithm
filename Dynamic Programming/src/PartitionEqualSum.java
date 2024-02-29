public class PartitionEqualSum {
    public static void main(String[] args) {

    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        boolean[] dp = new boolean[nums.length];

        for (int i = 0; i < dp.length; i++) {
            dp[i] = false;
        }

        if(sum % 2 != 0) return false;

        return func(nums.length - 1, sum / 2 , nums, dp);

    }

    public static boolean func(int i , int target , int[] a , boolean[] dp){
        if(target == 0) return true;
        if(i == 0) return (a[0] == target);

        if(dp[i]){
            return true;
        }

        boolean notTake = func(i - 1 , target , a, dp);
        boolean take = false;
        if(target >= a[i]) {
            take = func(i - 1 , target - a[i], a, dp);
        }

        return dp[i] = (take || notTake);
    }
}
