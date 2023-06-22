public class moveZeros {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        int temp = 0;
        int j =0;
        int n = nums.length;
        while(n != 0){
            for(int i = 0 ;i< nums.length -1;i++){
                if(nums[i] == 0){
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
            n--;
        }
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i]);
        }
    }
}
