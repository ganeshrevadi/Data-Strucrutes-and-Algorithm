public class RemoveDuplicate {
    public static void main(String[] args) {
         int[] nums = new int[]{0,1,2,2};
         int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println(j);
    }
}
