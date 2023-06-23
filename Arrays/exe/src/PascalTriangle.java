import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<Integer> w = new ArrayList<>();
        List<List<Integer>> a = new ArrayList();
        for(int i=1;i<10; i++){
            // your logic here make use of Arrays.asList()
            a.add(Arrays.asList(i, i+1));
        }
        System.out.println(a);

    }
}
