public class linear_search {
    public static void main(String[] args) {
        int[] nums = {4,5,42,52,122,12,25};
        int target = 88;
        int ans = linear_search(nums,target);
        System.out.println("The target is found at index:"+ (ans));
    }

    static  int linear_search(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int index =0;index<arr.length;index++){
            if(arr[index]==target){
                return index;
            }
        }
      return -1;
    }
}
