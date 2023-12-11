import java.util.*;
public class AllFactors {
    public static void main(String[] args) {
        System.out.println(allFactors(6));
    }
    public static ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> res = new ArrayList<>();
        int sqrtA = (int) Math.sqrt(A);
        for (int i = 1; i <= sqrtA; i++) {
            if (A % i == 0) {
                res.add(i);
                if (i != A / i) {
                    res.add(A / i);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}
