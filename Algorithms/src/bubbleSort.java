import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] nums = {5,2,4,3,1};
//        sort(nums);
        bubble_sort(nums, nums.length);
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
    public static void  bubble_sort(int arr[], int n) {
        // Base Case: range == 1.
        if (n == 1) return;

        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }

        //Range reduced after recursion:
        bubble_sort(arr, n - 1);
    }
}
