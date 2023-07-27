import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] nums = {5,2,4,3,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void sort(int[] nums){
        int n = nums.length;
        for(int i =  0; i < nums.length;i++){
            int j  = i;
            while(j > 0 && nums[j - 1] > nums[j]){
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
            }
        }
    }
}
