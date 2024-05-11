import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class Pair<A, B> {
    public A first;
    public B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }


}

public class Kth_smallest_prime_fraction {
    public static void main(String[] args) {

    }


    public static  int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Pair<Double, Pair<Integer, Integer>>> pq = new PriorityQueue<>((pair1, pair2) ->
                Double.compare(pair2.first, pair1.first));

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                double val = (arr[i] * 1.0) / arr[j];
                pq.add(new Pair<>(val, new Pair<>(i, j)));
                if(pq.size() > k) pq.poll();
            }
        }

        Pair<Integer, Integer> se = pq.poll().second;

        return new int[]{arr[se.first], arr[se.second]};
    }
}
