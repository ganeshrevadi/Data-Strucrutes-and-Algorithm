public class containDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        for(int i = 0 ; i< nums.length;i++){
            for(int j = i + 1 ;j<nums.length;j++){
                if(nums[i] == nums[j] && Math.abs(i - j) <= k){
                    System.out.println(true);
                }
            }
        }
        System.out.println(false);
    }
}
