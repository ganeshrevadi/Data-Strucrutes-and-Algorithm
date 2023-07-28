import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] nums = {5,2,4,3,1};
//        sort(nums);
        insertion_sort(nums,0, nums.length);
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

    public static void insertion_sort(int arr[], int i, int n) {

        // Base Case: i == n.
        if (i == n) return;

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertion_sort(arr, i + 1, n);
    }
}
