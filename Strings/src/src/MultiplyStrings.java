import java.math.BigInteger;
import java.util.Arrays;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("9999999999" , "2"));
    }

    public static String multiply(String A, String B) {
        long ans = Long.parseLong(A) * Long.parseLong(B);
        return Long.toString(ans);

    }

}
