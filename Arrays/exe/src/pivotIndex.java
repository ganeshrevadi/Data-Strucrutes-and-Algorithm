public class pivotIndex {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,-1,-1,1,1,1};
        int bsum = 0;
        int sum = 0;
        for(int j = 1;j<nums.length;j++){
            sum += nums[j];
        }
        if(sum == 0){
            System.out.println("0");
        }

        for(int i = 0;i<nums.length - 1;i++){
            bsum += nums[i];
            int asum = 0;
            for(int j = i + 2; j < nums.length;j++){
                asum += nums[j];

            }

            if(bsum == asum){
                System.out.println(i + 1);
            }

        }
    }
}
