import java.util.*;
public class pickFromBothSide {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(5);
        A.add(-2);
        A.add(3);
        A.add(1);
        A.add(2);
        System.out.println(solve(A, 3));

    }


    public static int solve(ArrayList<Integer> A, int B) {
        int maxSum = -1;
        int sum = 0;
        for(int i = 0 ; i < B ; i++){
            sum += A.get(i);
        }
        maxSum = sum;
        int j = 0;
        for(int i = A.size() - 1; i > A.size() - B ; i--){
            sum -= A.get(j);
            sum += A.get(i);
            if(sum > maxSum){
                maxSum = sum;
            }
            j++;
        }
        return maxSum;
    }
}
