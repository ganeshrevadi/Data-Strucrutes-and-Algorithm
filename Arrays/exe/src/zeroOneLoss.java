import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class zeroOneLoss {
    public static void main(String[] args) {

    }

    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer , Integer> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < matches.length; i++) {
            if(map.containsKey(matches[i][1])){
                map.put(matches[i][1] , map.get(matches[i][1]) + 1);
            }
            else{
                map.put(matches[i][1] , 1);
            }
        }

        for (int i = 0; i < matches.length; i++) {
            if(!map.containsKey(matches[i][0])){
                map.put(matches[i][0]  , 0 );
            }
        }

        List<Integer> zero = new ArrayList<>();
        List<Integer> one =  new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) == 0){
                zero.add(key);
            }
            if(map.get(key) == 1){
                one.add(key);
            }
        }

        Collections.sort(zero);
        Collections.sort(one);

        ans.add(zero);
        ans.add(one);

        return ans;
    }

}
