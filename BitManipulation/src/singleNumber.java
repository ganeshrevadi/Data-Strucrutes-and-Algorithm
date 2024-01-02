import java.util.HashMap;
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
}
