import java.lang.reflect.Array;
import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        HashSet<Integer> set = new HashSet<>();
        List<Integer> arrayList = new ArrayList<>();

        for(int i = 0 ;i < nums1.length;i++){
            set.add(nums1[i]);
        }

        for(int i = 0 ; i< nums2.length;i++){
            if(set.contains(nums2[i])){
                arrayList.add(nums2[i]);
                set.remove(nums2[i]);

            }
        }
        Integer[] integerArray = arrayList.toArray(new Integer[0]);
        int[] intArray = new int[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            intArray[i] = integerArray[i].intValue();
        }

    }
}
