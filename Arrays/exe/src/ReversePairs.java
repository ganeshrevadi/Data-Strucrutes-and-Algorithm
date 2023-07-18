//public class ReversePairs {
//    public static int count = 0;
//    public static void main(String[] args) {
//        int[] nums = {1,3,2,3,1};
//        System.out.println(revPairCount(nums,0,nums.length - 1));
//    }
//
//    static int revPairCount(int[] arr, int start,int end){
//        if(start == end){
//            return arr[start];
//        }
//
//        int mid = (start + end) /2;
//        int left = revPairCount(arr,start,mid);
//        int right = revPairCount(arr,mid + 1,end);
//
//        if(arr[left] > 2 * arr[right]){
//            return count++;
//        }
//
//        return count;
//    }
//
//}
public class ReversePairs {
    public static void main(String[] args) {
        int[] nums = {2,4,3,5,1};
        System.out.println(reversePairs(nums));
    }

    public static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static int mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return 0;
        }

        int mid = left + (right - left) / 2;
        int count = mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right);

        int i = left;
        int j = mid + 1;
        while (i <= mid && j <= right) {
            if ((long) nums[i] > 2 * (long) nums[j]) {
                count += mid - i + 1;
                j++;
            } else {
                i++;
            }
        }

        merge(nums, left, mid, right);
        return count;
    }

    public static void merge(int[] nums, int left, int mid, int right) {
        int[] merged = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                merged[k++] = nums[i++];
            } else {
                merged[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            merged[k++] = nums[i++];
        }

        while (j <= right) {
            merged[k++] = nums[j++];
        }

        System.arraycopy(merged, 0, nums, left, right - left + 1);
    }
}
