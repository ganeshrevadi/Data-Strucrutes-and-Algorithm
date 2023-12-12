import java.util.*;

public class HighestScore {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> A = new ArrayList<>();
        A.add(new ArrayList<>());
    }

    public static int highestScore(ArrayList<ArrayList<String>> A) {
        HashMap<String , Integer> map = new HashMap<>();
        for(int i = 0; i < A.size(); ++i) {
            if (map.containsKey(A.get(i).get(0))) {
                map.put(A.get(i).get(0),map.get(A.get(i)) + Integer.valueOf(A.get(i).get(1)));
            } else {
                map.put(A.get(i).get(0), Integer.valueOf(A.get(i).get(1)));
            }
        }
        int max  = Integer.MIN_VALUE;
        for(String ele : map.keySet()){
            int val = map.get(ele);
            if(val > max){
                max = val;
            }
        }
        return max;
    }
}
