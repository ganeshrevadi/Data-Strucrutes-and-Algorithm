import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Kth_smallest_prime_fraction {
    public static void main(String[] args) {

    }


    public static  int[] kthSmallestPrimeFraction(int[] arr, int k) {
        ArrayList<Float> a = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i < j){
                    a.add((float)(arr[i] / arr[j]));
                }
            }
        }

        Collections.sort(a);

        return new int[1];
    }
}
