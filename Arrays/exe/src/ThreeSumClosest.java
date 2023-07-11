
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        int sum = 0;
        int diff = 0;
        int prevdif  = 0;
        for(int i = 2;i<nums.length;i++){
            sum = nums[i] + nums[i - 1] + nums[i - 2];
            diff =Math.abs(target - sum);
            if(prevdif > diff){
                prevdif = diff;
            }

        }
        sum = Math.abs(sum);
        System.out.println(sum);

    }
}
