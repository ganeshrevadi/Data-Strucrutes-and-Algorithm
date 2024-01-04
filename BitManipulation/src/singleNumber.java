import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class singleNumber {
    public static void main(String[] args) {

    }

    public static int singleNumber(final List<Integer> A) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            if(map.containsKey(A.get(i))){
                map.put(A.get(i) , map.get(A.get(i)) + 1);
            }
            else{
                map.put(A.get(i) , 1);
            }
        }

        for (int ele : map.keySet()){
            if(map.get(ele) == 1){
                return ele;
            }
        }

        return -1;
    }

    public int solve(int[] A, int B) {
        if(B == 0){
            return 0;
        }
        Hashtable<Integer , Integer> map = new Hashtable<>();
        for(int i = 0; i < A.length; i++) {
            if(map.contains(A[i])){
                map.put(A[i] , map.get(A[i]) + 1);
            }
            else {
                map.put(A[i], 1);
            }
        }
        if(B == 0){
            for (int key : map.keySet()) {
                if(map.get(key) >= 2){
                    return 1;
                }
            }
        }
        for(int i = 0 ; i < A.length;i++){
            if(map.containsKey(B + A[i])){
                return 1;
            }
        }
        return 0;
    }


}
