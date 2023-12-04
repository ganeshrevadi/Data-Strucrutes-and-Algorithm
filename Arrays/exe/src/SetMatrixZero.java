import java.util.*;
public class SetMatrixZero {
    public static void main(String[] args) {

    }


    public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int numRows = a.size();
        int numCols = a.get(0).size();

        boolean[] zeroRows = new boolean[numRows];
        boolean[] zeroCols = new boolean[numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (a.get(i).get(j) == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    a.get(i).set(j, 0);
                }
            }
        }
    }
}
