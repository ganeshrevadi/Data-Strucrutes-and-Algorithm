public class containDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        for(int i = 0 ; i< k;i++){
            for(int j = i + 1 ;j<= i + k && j<nums.length;j++){
                if(nums[i] == nums[j]){
                    System.out.println(true);
                }
            }
        }
        System.out.println(false);
    }
}
