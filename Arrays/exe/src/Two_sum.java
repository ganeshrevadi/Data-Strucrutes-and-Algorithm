public class Two_sum {
    public static void main(String[] args) {
        int[] nums =new int[] {3,2,4};
        int target = 6;
        int[] ans = new int[2];
        int check;
        for(int i = 0; i< nums.length -1;i++){
            for(int j = i + 1 ; j< nums.length ; j++){
                check = nums[i] + nums[j];
                if(check == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }


    }
}
