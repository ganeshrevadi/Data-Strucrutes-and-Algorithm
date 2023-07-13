import java.util.*;
public class KFrequent {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int n = 3;
        int k = 2;

        List<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));
        for (int z: map.keySet()) {
            heap.add(z);
            if (heap.size() > k) heap.poll();
        }

        int[] top = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
        }
        System.out.println(Arrays.toString(top));
    }
}
