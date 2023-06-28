import java.awt.*;
import java.util.ArrayList;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,1,0,-3,3};
        int[] ans = productExceptSelf(nums);

        for (int num : ans) {
            System.out.print(num + " ");
        }
//        int help = 0;
//        int product;
//        int k = 0;
////        for (int i = 0; i < nums.length; i++) {
////            product = 1;
////            for (int j = 0; j < nums.length; j++) {
////                if(i != j) {
////                    product *= nums[j];
////                }
////            }
////            ans[k] = product;
////            k++;
////        }
////        System.out.println(ans);
    }

    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] leftprod=new int[n];
        int[] rightprod = new int[n];
        int[] ans = new int[n];
        leftprod[0] = 1;
        for (int i = 1; i < n; i++) {
            leftprod[i] = leftprod[i - 1] * nums[i - 1];
        }
        rightprod[n - 1] = 1;
        for (int i = n - 2; i>=0; i--) {
            rightprod[i] = rightprod[i+1] * nums[i +1];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = leftprod[i] * rightprod[i];
        }
        return ans;
    }
}
