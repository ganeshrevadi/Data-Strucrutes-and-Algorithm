

public class pratice {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println(buildArray(nums));

    }

    public static int[] buildArray(int[] nums) {
        int[] ans = {};
        for (int i = 0; i < 6; i++) {
            ans[i] = nums[nums[i]];

        }
        return ans;


    }
}
