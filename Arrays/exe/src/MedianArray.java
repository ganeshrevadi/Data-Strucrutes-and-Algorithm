import java.util.Arrays;

public class MedianArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        int[] ans = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, ans, 0, nums1.length);
        System.arraycopy(nums2, 0, ans, nums1.length, nums2.length);
        Arrays.sort(ans);


        if(ans.length % 2 == 0){
            int res = ans[(ans.length - 1)/ 2 ] + ans[ans.length / 2];
            res /= 2;
            System.out.println(res);
        }
        else{
            int res2 = ans[(ans.length - 1) /2 ];
            System.out.println(res2);
        }
    }
}
