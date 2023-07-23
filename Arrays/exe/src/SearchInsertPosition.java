public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(findIndex(nums,7));
    }
    public static int findIndex(int[] arr,int x) {
        int l = 0, r = arr.length - 1;
        int m =0;
        while (l <= r) {
            m = l + (r - l) / 2;

            if (arr[m] == x)
                return m;

            if (arr[m] < x)
                l = m + 1;

            else
                r = m - 1;
        }

        return l;
    }
}
