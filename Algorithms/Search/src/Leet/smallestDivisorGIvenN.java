package Leet;

public class smallestDivisorGIvenN {
    public static void main(String[] args) {
            int[] arr = {1,2,5,9};
            int th = 6;
        System.out.println(smallestDivisor(arr,th));
    }

    public static boolean possible(int[] nums, int threshold, int mid) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < mid){
                res++;
            }
            else{
                res += Math.ceil(nums[i] / mid);
            }
        }
        return res <= threshold;
    }
    public  static int smallestDivisor(int[] arr, int threshold) {
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            low = Math.min(low, arr[i]);
            high = Math.max(high, arr[i]);
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(possible(arr,threshold,mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
