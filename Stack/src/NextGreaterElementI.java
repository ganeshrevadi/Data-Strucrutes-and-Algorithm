import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementI {
    public static void main(String[] args) {
        Stack<Integer> st1= new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int max = 0;
        int[] ans = new int[nums1.length];
        int j = 0;

        for(int i = 0;i<nums1.length;i++){
            st1.push(nums1[i]);
        }
        for(int i = 0;i<nums2.length;i++){
            st2.push(nums2[i]);
        }

        while(!st1.isEmpty()){
            int ref = st1.pop();
            if(st2.peek() == ref){
                ans[j++] = -1;
            }
            while(!st2.isEmpty() && st2.peek() != ref){
                if(st2.peek() > max){
                    max = st2.pop();
                }
            }
            if(st2.peek() == ref){
                ans[j++] = max;
                break;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
