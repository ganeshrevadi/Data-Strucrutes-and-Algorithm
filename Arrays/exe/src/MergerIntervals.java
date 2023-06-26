import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
public class MergerIntervals {
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,4},{0,2},{3,5}};
        int flag = 0;
        int[][] newArray2D = new int[intervals.length - 1][];
        int n = intervals.length - 1;
        while(n != 0) {
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i - 1][1] >= intervals[i][0] && intervals[i - 1][0] < intervals[i][1]) {
                    flag = 1;
                    if (intervals[i - 1][0] > intervals[i][0]) {
                        intervals[i - 1][0] = intervals[i][0];
                    }
                    if (intervals[i - 1][1] < intervals[i][1]) {
                        intervals[i - 1][1] = intervals[i][1];
                    }
                    for (int k = i + 1; k < intervals.length; k++) {
                        intervals[k - 1] = intervals[k];
                    }
                    System.arraycopy(intervals, 0, newArray2D, 0, newArray2D.length);
                }
            }
            n--;
        }
        if(flag == 0){
            for (int i = 0; i < intervals.length; i++) {
                for (int j = 0; j < intervals[i].length; j++) {
                    System.out.print(intervals[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            for (int i = 0; i < newArray2D.length; i++) {
                for (int j = 0; j < newArray2D[i].length; j++) {
                    System.out.print(newArray2D[i][j] + " ");
                }
                System.out.println();
            }
        }
        }
}
