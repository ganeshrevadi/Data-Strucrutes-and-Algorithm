public class ReversePairs {
    public static int count = 0;
    public static int left = 0;
    public static int right = 0;
    public static void main(String[] args) {
        int[] nums = {1,3,2,3,1};

//        for(int i = 0;i < nums.length;i++){
//            for(int j = i + 1;j<nums.length;j++){
//
//                if(nums[i] > (long)2 * nums[j]){
//                    count++;
//                }
//            }
//        }
        count = findlargest(nums,0, nums.length - 1);
        System.out.println(count);
    }
    static public int findlargest(int[] arr,int l,int hi){
        if(l == hi){
            return l;
        }

        int mid =  (l + hi) / 2;
        if(arr[left] > 2 * arr[right]){
            count++;
        }
        left = findlargest(arr, l, mid);
        right = findlargest(arr, mid + 1, hi);

        return count;
    }
}
