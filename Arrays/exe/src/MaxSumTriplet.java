import java.util.*;
public class MaxSumTriplet {
    public static void main(String[] args) {
        int[] a = {2, 5, 3, 1, 4, 9};
        ArrayList<Integer> A = new ArrayList<>();
        for(int ele : a ){
            A.add(ele);
        }

        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> a) {
        int n = a.size();

        int[] right = new int[n];
        right[n-1] = a.get(n-1);
        for(int i = n-2; i >= 0; i--){
            right[i] = Math.max(right[i+1], a.get(i));
        }

        TreeSet<Integer> lowValue = new TreeSet<Integer>();
        lowValue.add(a.get(0));
        int max_so_far = 0;
        for(int i = 1; i < n-1; i++){
            Integer second = a.get(i);
            Integer first = lowValue.lower(second);
            Integer third = right[i+1];
            if(first != null && first < second && second < third){
                max_so_far = Math.max(max_so_far, first + second + third);
            }
            lowValue.add(a.get(i));
        }
        return max_so_far;
    }
}
