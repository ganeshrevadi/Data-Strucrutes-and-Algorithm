import java.util.*;
public class AntiDiagonal {
    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();


        for(int i = 0 ; i < A.size(); i++){
            for (int j = 0; j < A.get(0).size(); j++) {
                ArrayList<Integer> row = new ArrayList<>();
                int index = i + j;
                if (index < res.size() && res.get(index).isEmpty()) {
                    row.add(A.get(i).get(j));
                    res.add(row);
                } else if (index < res.size()) {
                    row = res.get(index);
                    row.add(A.get(i).get(j));
                } else {
                    row.add(A.get(i).get(j));
                    res.add(row);
                }

            }
        }
        return res;
    }
}
