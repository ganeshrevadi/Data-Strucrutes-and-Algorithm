import java.util.*;
public class peakPerfect {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        int[] arr = {9895, 30334, 17674, 23812, 20038, 25668, 6869, 1870, 4665, 27645, 7712, 17036, 31323, 8724, 28254, 28704, 26300, 25548, 15142, 12860, 19913, 32663, 32758};
        for(int le : arr){
            a.add(le);
        }
        System.out.println(perfectPeak(a));

    }
    public static int perfectPeak(ArrayList<Integer> A) {
        int flag = 0;

        for (int i = 1; i < A.size() - 2; i++) {
            ArrayList<Integer> a1 = new ArrayList<>(A.subList(0 , i));
            ArrayList<Integer> a2 = new ArrayList<>(A.subList(i + 1 , A.size()));
            Collections.sort(a1);
            Collections.sort(a2);

            if(A.get(i) > a1.get(a1.size()  - 1) && A.get(i) < a2.get(0)){
                flag = 1;
                break;
            }

        }
        return flag;
    }
}
