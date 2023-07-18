import java.util.Arrays;
import java.util.PriorityQueue;

public class missingPositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) minHeap.add(nums[i]);
        }
        int minMissing = 1;

        while(! minHeap.isEmpty()) {
            int element = minHeap.poll();
            if(element == minMissing) minMissing ++;
            else if(element > minMissing) break;
        }
        System.out.println(minMissing);
    }
}
