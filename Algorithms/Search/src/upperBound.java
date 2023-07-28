public class upperBound {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int ans = UB(arr, 3);
        System.out.println(ans);
    }

    static int UB(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
