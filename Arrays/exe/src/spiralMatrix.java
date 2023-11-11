import java.math.BigInteger;
import java.util.*;
public class spiralMatrix {
    public static void main(String[] args) {
        int a = 5;

        List<ArrayList<Integer>> A   = new ArrayList<>();
        A.add(0 , new ArrayList<>());
        A.get(0).add(1);
        A.get(0).add(2);
        A.add(1, new ArrayList<>());
        A.get(1).add(3);
        A.get(1).add(4);
        A.add(2 , new ArrayList<>());
        A.get(2).add(5);
        A.get(2).add(6);
        System.out.println(spiralOrder(A));

    }

    static public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> result = new ArrayList<>();

        int top = 0, bottom = A.size() - 1, left = 0, right = A.get(0).size() - 1;

        while (top <= bottom && left <= right) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                result.add(A.get(top).get(i));
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                result.add(A.get(i).get(right));
            }
            right--;

            // Traverse bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(A.get(bottom).get(i));
                }
                bottom--;
            }

            // Traverse left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(A.get(i).get(left));
                }
                left++;
            }
        }

        return result;
    }

}
