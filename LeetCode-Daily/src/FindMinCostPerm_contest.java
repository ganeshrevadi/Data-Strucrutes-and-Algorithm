import java.util.Arrays;

public class FindMinCostPerm_contest {
    public static void main(String[] args) {
        int[] nums = {1, 0 , 2};
        int[] ans =findPermutation(nums);
        System.out.println(Arrays.toString(ans));
    }


    public  static  int[] findPermutation(int[] nums) {
        int n = nums.length;

        int[] perm = new int[n];

        // Create an array of indices from 0 to n-1
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort the indices array based on the corresponding values in nums
        Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));

        // Populate the permutation array using sorted indices
        for (int i = 0; i < n; i++) {
            perm[i] = indices[i];
        }

        return perm;
    }
}
