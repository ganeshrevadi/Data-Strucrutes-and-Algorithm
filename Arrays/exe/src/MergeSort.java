import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m =3;
        int n = 3;
        int[] res = new int[m+n];
        int i;
        for (i = 0; i<m ; i++) {
            res[i] = nums1[i];
        }
        for (int j = 0; j < n; j++) {

            res[i] = nums2[j];
            i++;
        }
        Arrays.sort(res);
        for (int k = 0; k < m+n; k++) {
            System.out.println(res[k]);
        }

    }
}
