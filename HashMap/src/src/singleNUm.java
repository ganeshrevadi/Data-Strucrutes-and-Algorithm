import java.util.HashMap;

public class singleNUm {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] nums = {2,2,1};
        for(int n : nums){
            if(map.containsKey(n)){
                map.put(n,map.getOrDefault(n,0)+1);
            }
            else {
                map.put(n,1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) == 1 ){
                System.out.println(key);
            }
        }
    }
}
