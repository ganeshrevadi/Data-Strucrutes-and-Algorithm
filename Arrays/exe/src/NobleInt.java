import java.util.*;
public class NobleInt {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        int[] arr = {5,6,2};
        for(int ele : arr){
            A.add(ele);
        }

        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            if(map.containsKey(A.get(i))){
                map.put(A.get(i), map.get(A.get(i)) + 1);
            }
            else{
                map.put(A.get(i),1);
            }
        }
        int cnt = A.size();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            cnt -= entry.getValue();
            if (cnt == entry.getKey()) {
                return 1;
            }
        }

        return -1;
    }

}
