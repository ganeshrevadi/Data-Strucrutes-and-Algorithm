import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class reverseBits {
    public static void main(String[] args) {
        System.out.println(reverse(3));
    }

    public static long reverse(long a) {
        ArrayList<Long> arr = convertToBinary(a);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
        int n = arr.size();
        if(arr.size() != 32){
            for (int i = 0; i < 32 - n; i++) {
                arr.add((long)0);
            }
        }

        long  num = 0;
        int pow = 0;
        for(int i = arr.size() - 1 ; i >= 0 ; i--){
            num  += arr.get(i) * (long)Math.pow(2, pow);
            pow++;

        }

        return Long.valueOf(num);
    }

    public static ArrayList<Long> convertToBinary(long decimalNumber) {
        // Initialize an ArrayList to store the binary representation
        ArrayList<Long> binary = new ArrayList<>();

        // Continue dividing the number by 2 and add the remainders to the ArrayList
        while (decimalNumber > 0) {
            long remainder = decimalNumber % 2;
            binary.add(0, remainder); // Add at the beginning to reverse the order
            decimalNumber /= 2;
        }

        // If the original number was 0, the loop won't run, so add 0 manually
        if (binary.isEmpty()) {
            binary.add(0L);
        }

        return binary;
    }
}
