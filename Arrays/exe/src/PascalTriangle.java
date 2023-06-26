import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            if (i > 0) {
                List<Integer> prevRow = triangle.get(i - 1);
                for (int j = 0; j < prevRow.size() - 1; j++) {
                    int sum = prevRow.get(j) + prevRow.get(j + 1);
                    row.add(sum);
                }
            }

            if (i > 0) {
                row.add(1);
            }

            triangle.add(row);
        }

    }
}
