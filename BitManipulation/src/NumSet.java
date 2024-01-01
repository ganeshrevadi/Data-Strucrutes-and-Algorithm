import java.util.ArrayList;
import java.util.Arrays;

public class NumSet {
    public static void main(String[] args) {
        System.out.println("Hey");
    }

    public static int numSetBits(long a) {
        ArrayList<Long> arr = new ArrayList<>();
        while (a > 0){
            long rem = a % 2;
            arr.add(rem);
            a /= 2;
        }
        int count = 0;
        for (long ele : arr){
            if(ele == 1){
                count++;
            }
        }

        return count;
    }

}
