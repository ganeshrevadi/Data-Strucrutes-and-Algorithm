import java.util.ArrayList;

public class JosephusProblem {
    public static void main(String[] args) {
        int k = 7;
        int n = 40;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i);
        }
        k--;
        solve(arr,k,0);
    }

    public static void solve(ArrayList<Integer> arr , int k , int index){
        if(arr.size() == 1){
            System.out.println(arr.get(0) + 1);
            return;
        }
        index = (index + k) % arr.size();
        arr.remove(index);
        solve(arr,k, index);
        return;
    }
}
