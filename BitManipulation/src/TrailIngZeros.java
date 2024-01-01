import java.util.*;
public class TrailIngZeros {
    public static void main(String[] args) {
        System.out.println(solve(8));
    }
    public static int solve(int a) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (a > 0){
            int rem = a % 2;
            arr.add(rem);
            a /= 2;
        }
        int count = 0;
        for(int ele : arr){
            if(ele != 0){
                break;
            }
            count++;
        }

        for (int i = arr.size() - 1; i >= 0 ; i--) {
            if(arr.get(i) != 0){
                break;
            }
            count++;
        }
        return count;
    }
}
