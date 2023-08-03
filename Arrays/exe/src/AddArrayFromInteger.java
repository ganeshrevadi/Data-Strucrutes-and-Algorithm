import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddArrayFromInteger {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        List<Integer> ls = new ArrayList<>();
        int k = 1;
        int ref = 0;
        for(int n : num){
            ref *= 10;
            ref += n;
        }

        ref += k;

        while(ref != 0) {
            ls.add(ref % 10);
            ref /= 10;
        }
        Collections.reverse(ls);
        System.out.println(ls);
    }
}
