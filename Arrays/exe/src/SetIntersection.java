import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class SetIntersection {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {1, 4}, {2, 5} , {3, 5}};

        System.out.println(setIntersection(arr));
     }

    public static int setIntersection(int[][] intervals) {
//        Set<Integer> s = new HashSet<>();
//        for(int i = 0 ; i< A.length - 1; i++){
//            for (int j = 0; j < A[i].length - 1; j++) {
//                if(A[i][j + 1] - A[i][j] >= 2){
//                    s.add(A[i][j + 1]);
//                    s.add(A[i][j + 1] - 1);
//                }
//                else{
//                    s.add(A[i][j]);
//                    s.add(A[i][j + 1]);
//                }
//            }
//        }
//        System.out.println(s);
//        return s.toArray().length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int[] S = new int[2 * intervals.length];
        int size = 0;

        for (int i = 0; i < intervals.length; i++) {
            int end = intervals[i][1];

            if (size == 0 || end > S[size - 1]) {
                S[size++] = end;
                S[size++] = end - 1;
            } else {
                S[size - 1] = Math.min(S[size - 1], end - 1);
            }
        }

        Set<Integer> s = new HashSet<>();
        for(int ele : S){
            s.add(ele);
        }
        // Print the selected set S
        System.out.println("Selected Set S: " + Arrays.toString(Arrays.copyOf(S, size)));

        return s.size();
    }
}
