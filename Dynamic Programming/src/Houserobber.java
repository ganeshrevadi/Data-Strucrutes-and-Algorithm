public class Houserobber {
    public static void main(String[] args) {

    }


    public static int Tabualtion(int[] nums){
//        int[] dp = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            dp[i] = 0;
//        }

        int prev = nums[0];
        int prev2  = 0;
        for (int i = 1; i < nums.length ; i++) {
            int take = nums[i];
            if(i > 1) take += prev2;
            int notTake = prev;

            int curi = Math.max(take , notTake);
            prev2 = prev;
            prev = curi;
        }

        return prev;
    }
}
