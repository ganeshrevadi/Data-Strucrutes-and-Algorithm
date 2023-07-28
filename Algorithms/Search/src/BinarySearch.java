public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int ans = binary(arr, 5);
        System.out.println(ans);
    }

    public static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}