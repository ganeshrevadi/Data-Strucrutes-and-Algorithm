import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.SortedMap;

public class sildingWIndowMax {
    public static void main(String[] args) {
        Deque<Integer> Q = new ArrayDeque<>();
        int k = 3;
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] res = new int[nums.length - k + 1];
        int i;
        int j = 0;
        for(i = 0;i< k;++i){
            while ((!Q.isEmpty()) && nums[i] >= nums[Q.peekLast()]) {
                Q.removeLast();
            }
            Q.addLast(i);
        }

        for (;  i< nums.length ; i++) {
             res[j++] = nums[Q.peek()];


             while ((!Q.isEmpty()) && Q.peek() <= i - k){
                 Q.removeFirst();
             }

             while ((!Q.isEmpty()) && nums[i] >= nums[Q.peekLast()]){
                 Q.removeLast();
             }
             Q.addLast(i);

        }
        res[j++] =nums[Q.peek()];
        System.out.println(Arrays.toString(res));
    }
}
