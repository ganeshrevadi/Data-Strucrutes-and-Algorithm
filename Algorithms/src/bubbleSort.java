import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] nums = {5,2,4,3,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sort(int[] nums){
        int n = nums.length;
        for(int i = 0 ; i< n;i++){
            for (int j = i + 1; j < n; j++) {
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
