import java.math.BigInteger;

public class rmMaxRes {
    public static void main(String[] args) {
        System.out.println(removeDigit("1231" , '1'));
    }

    public static String removeDigit(String number, char digit) {
        BigInteger max = BigInteger.valueOf(Long.MIN_VALUE);
        StringBuilder s = new StringBuilder(number);
        String res = "";
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == digit){
                s.deleteCharAt(i);
                BigInteger currentNumber = new BigInteger(s.toString());
                if(max.compareTo(currentNumber) < 0){
                    max = currentNumber;
                    res = s.toString();
                }
                s = new StringBuilder(number);
            }
        }

        return res;
    }
}
