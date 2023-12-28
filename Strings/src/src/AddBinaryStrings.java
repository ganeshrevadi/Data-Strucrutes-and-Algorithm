import java.util.Arrays;
import java.util.Collection;

public class AddBinaryStrings {
    public static void main(String[] args) {

    }

    public  static String addBinary(String A, String B) {
        StringBuilder s = new StringBuilder();
        int carry = 0;
        StringBuilder a = new StringBuilder(A);
        StringBuilder b = new StringBuilder(B);
        a.reverse();
        b.reverse();

       for(int i = 0 ;  i < Math.max(a.length() , b.length()) ; i++){
           int digitA = i < a.length() ? Integer.parseInt(String.valueOf(a.charAt(i))) : 0;
           int digitB = i < b.length() ? Integer.parseInt(String.valueOf(b.charAt(i))) : 0;
            int total = digitA + digitB + carry;
            s.append(String.valueOf(total % 2));
            carry = total / 2;
       }

       if(carry == 1){
           s.append("1");
       }

       return s.reverse().toString();
    }
}
