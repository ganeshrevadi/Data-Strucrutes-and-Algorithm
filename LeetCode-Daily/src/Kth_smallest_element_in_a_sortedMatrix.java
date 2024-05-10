import java.util.PriorityQueue;

public class Kth_smallest_element_in_a_sortedMatrix {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public int kthSmallest(int[][] matrix, int k) {
        // ArrayList<Integer> a = new ArrayList<Integer>();
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                q.add(matrix[i][j]);

                if(q.size() > k ) q.poll();
            }
        }

        return q.peek();
    }
}