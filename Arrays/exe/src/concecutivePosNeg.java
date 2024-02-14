import java.util.ArrayList;
import java.util.Collections;

public class concecutivePosNeg {
    public static void main(String[] args) {

    }

    public static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] >= 0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }


        for(int i = 0 ; i < neg.size() ; i++){
            res.add(pos.get(i));
            res.add(neg.get(i));
        }
        int[] intArray = res.stream().mapToInt(Integer::intValue).toArray();
        return intArray;
    }
}
