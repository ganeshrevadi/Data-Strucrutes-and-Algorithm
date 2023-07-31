package Leet;

public class peakElement {
    public static void main(String[] args) {
        int[] arr = {5,6,7,3,2,1};
        System.out.println(findPeak(arr));
    }

    static int findPeak(int[] nums){
        int n = nums.length;
        if(n == 1) return 0;
        if(nums[0] > nums[1]){
            return 0;
        }
        if(nums[nums.length - 1] > nums[nums.length - 2]){
            return nums.length - 1;
        }
        int low = 1;
        int high = nums.length - 2;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]){
                return mid;
            }
            if(nums[mid] < nums[mid + 1] && nums[mid] > nums[mid - 1]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return -1;
    }
}
