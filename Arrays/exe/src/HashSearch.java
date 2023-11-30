import java.util.*;

public class HashSearch {
    public static void main(String[] args) {

        int[] arr = {56, 35, 25, 32, 41, 50, 7, 52, 34, 41, 72, 12, 93, 50, 19, 94, 13, 19};
        ArrayList<Integer> A = new ArrayList<>();
        for (int value : arr) {
            A.add(value);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findOccurences(A));
    }

    public static ArrayList<Integer> findOccurences(ArrayList<Integer> A) {

        Collections.sort(A);
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < A.size(); i++) {
            if(map.containsKey(A.get(i))){
                map.put(A.get(i), map.get(A.get(i)) + 1);
            }
            else{
                map.put(A.get(i),1);
            }
        }
        return new ArrayList<Integer>(map.values());
    }
}
