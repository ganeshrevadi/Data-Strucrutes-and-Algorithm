import java.util.*;
public class Nby3 {
    public static void main(String[] args) {

    }
    public int repeatedNumber(final List<Integer> A) {
        int n = A.size();
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            if(map.containsKey(A.get(i))){
                map.put(A.get(i), map.get(A.get(i)) + 1);
            }
            else{
                map.put(A.get(i),1);
            }
        }

        for(int ele : map.keySet()){
            if(map.get(ele) > n/3 ){
                return ele;
            }
        }
        return -1;
    }

}
