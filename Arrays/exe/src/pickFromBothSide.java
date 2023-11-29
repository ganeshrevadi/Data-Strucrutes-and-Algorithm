import java.util.*;
public class pickFromBothSide {
    public static void main(String[] args) {
        int[] array = {1, 2};

        ArrayList<Integer> A = new ArrayList<>();
        for (int value : array) {
           A.add(value);
        }
        System.out.println(solve(A, 1));

    }


    public static int solve(ArrayList<Integer> A, int B) {
        int maxSum = -1;
        int sum = 0;
        for(int i = 0 ; i < B ; i++){
            sum += A.get(i);
        }
        maxSum = sum;
        int j = B - 1;
        for(int i = A.size() - 1; i >= A.size() - B ; i--){
            sum -= A.get(j);
            sum += A.get(i);
            if(sum > maxSum){
                maxSum = sum;
            }
            j--;
        }
        return maxSum;
    }
}
