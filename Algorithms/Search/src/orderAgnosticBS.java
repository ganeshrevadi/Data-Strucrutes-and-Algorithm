public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int ans = BS(arr, 2);
        System.out.println(ans);
    }
    static int BS(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isAsc) {
                if(target > arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            } else if (target == arr[mid]) {
                return mid;
            } else {
                if(target < arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
