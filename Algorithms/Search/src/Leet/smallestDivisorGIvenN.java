package Leet;

public class smallestDivisorGIvenN {
    public static void main(String[] args) {
            int[] arr = {44,22,33,11,1};
            int th = 5;
        System.out.println(smallestDivisor(arr,th));
    }

    public static boolean possible(int[] nums, int threshold, int mid) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
                res += Math.ceil((double) nums[i] / (double) mid);
        }
        return res <= threshold;
    }
    public  static int smallestDivisor(int[] arr, int threshold) {
        int n = arr.length;
        if(n > threshold) return -1;
        int low = 1, high = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
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
