import java.util.HashSet;

public class Daily {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> map = new HashSet<>();

        for(int num : nums1){
            map.add(num);
        }

        for(int num : nums2){
            if (map.contains(num)){
                return num;
            }
        }

        return -1;
    }
}
